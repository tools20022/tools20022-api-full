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
import com.tools20022.repository.codeset.DataModification1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DataModification1Code#InsertNewDataSet
 * DataModification1Code.InsertNewDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataModification1Code#UpdateDataSetDetails
 * DataModification1Code.UpdateDataSetDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataModification1Code#DeleteDataSet
 * DataModification1Code.DeleteDataSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DataModificationCode
 * DataModificationCode}</li>
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
 * "DataModification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specified the type of modification to be applied on a data set."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataModification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification1Code
	 * DataModification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsertNewDataSet"</li>
	 * </ul>
	 */
	public static final DataModification1Code InsertNewDataSet = new DataModification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsertNewDataSet";
			owner_lazy = () -> com.tools20022.repository.codeset.DataModification1Code.mmObject();
			codeName = DataModificationCode.InsertNewDataSet.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification1Code
	 * DataModification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDataSetDetails"</li>
	 * </ul>
	 */
	public static final DataModification1Code UpdateDataSetDetails = new DataModification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDataSetDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.DataModification1Code.mmObject();
			codeName = DataModificationCode.UpdateDataSetDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification1Code
	 * DataModification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeleteDataSet"</li>
	 * </ul>
	 */
	public static final DataModification1Code DeleteDataSet = new DataModification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeleteDataSet";
			owner_lazy = () -> com.tools20022.repository.codeset.DataModification1Code.mmObject();
			codeName = DataModificationCode.DeleteDataSet.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataModification1Code> codesByName = new LinkedHashMap<>();

	protected DataModification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INSE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataModification1Code";
				definition = "Specified the type of modification to be applied on a data set.";
				trace_lazy = () -> DataModificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataModification1Code.InsertNewDataSet, com.tools20022.repository.codeset.DataModification1Code.UpdateDataSetDetails,
						com.tools20022.repository.codeset.DataModification1Code.DeleteDataSet);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InsertNewDataSet.getCodeName().get(), InsertNewDataSet);
		codesByName.put(UpdateDataSetDetails.getCodeName().get(), UpdateDataSetDetails);
		codesByName.put(DeleteDataSet.getCodeName().get(), DeleteDataSet);
	}

	public static DataModification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataModification1Code[] values() {
		DataModification1Code[] values = new DataModification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataModification1Code> {
		@Override
		public DataModification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataModification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}