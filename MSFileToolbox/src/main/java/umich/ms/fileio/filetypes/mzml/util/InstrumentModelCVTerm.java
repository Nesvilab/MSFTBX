/*
 * Copyright 2016 Dmitry Avtonomov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package umich.ms.fileio.filetypes.mzml.util;

/**
 * @author Dmitry Avtonomov
 */
public class InstrumentModelCVTerm extends CVTerm {

  public final String vendor;
  public final String model;

  public InstrumentModelCVTerm(String accession, String name, String vendor, String model) {
    super(accession, name);
    this.vendor = vendor;
    this.model = model;
  }

  @Override
  public String toString() {
    return vendor + ": " + model;
  }
}
