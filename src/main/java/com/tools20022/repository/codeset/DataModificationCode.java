/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DataModificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specified the type of modification to be applied on a data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataModificationCode#InsertNewDataSet
 * DataModificationCode.InsertNewDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataModificationCode#UpdateDataSetDetails
 * DataModificationCode.UpdateDataSetDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataModificationCode#DeleteDataSet
 * DataModificationCode.DeleteDataSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DataModification1Code
 * DataModification1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DataModification2Code
 * DataModification2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INSE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataModificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specified the type of modification to be applied on a data set."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataModificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Insert a new set of data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataModificationCode
	 * DataModificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsertNewDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insert a new set of data."</li>
	 * </ul>
	 */
	public static final DataModificationCode InsertNewDataSet = new DataModificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsertNewDataSet";
			definition = "Insert a new set of data.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataModificationCode.mmObject();
			codeName = "INSE";
		}
	};
	/**
	 * Update the details of an existing set of data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataModificationCode
	 * DataModificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDataSetDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Update the details of an existing set of data."</li>
	 * </ul>
	 */
	public static final DataModificationCode UpdateDataSetDetails = new DataModificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDataSetDetails";
			definition = "Update the details of an existing set of data.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataModificationCode.mmObject();
			codeName = "UPDT";
		}
	};
	/**
	 * Delete an existing set of data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataModificationCode
	 * DataModificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeleteDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delete an existing set of data."</li>
	 * </ul>
	 */
	public static final DataModificationCode DeleteDataSet = new DataModificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeleteDataSet";
			definition = "Delete an existing set of data.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataModificationCode.mmObject();
			codeName = "DELT";
		}
	};
	final static private LinkedHashMap<String, DataModificationCode> codesByName = new LinkedHashMap<>();

	protected DataModificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INSE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataModificationCode";
				definition = "Specified the type of modification to be applied on a data set.";
				derivation_lazy = () -> Arrays.asList(DataModification1Code.mmObject(), DataModification2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataModificationCode.InsertNewDataSet, com.tools20022.repository.codeset.DataModificationCode.UpdateDataSetDetails,
						com.tools20022.repository.codeset.DataModificationCode.DeleteDataSet);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InsertNewDataSet.getCodeName().get(), InsertNewDataSet);
		codesByName.put(UpdateDataSetDetails.getCodeName().get(), UpdateDataSetDetails);
		codesByName.put(DeleteDataSet.getCodeName().get(), DeleteDataSet);
	}

	public static DataModificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataModificationCode[] values() {
		DataModificationCode[] values = new DataModificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataModificationCode> {
		@Override
		public DataModificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataModificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}