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
import com.tools20022.repository.codeset.DataModification2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DataModification2Code#InsertNewDataSet
 * DataModification2Code.InsertNewDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataModification2Code#DeleteDataSet
 * DataModification2Code.DeleteDataSet}</li>
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
 * "DataModification2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specified the type of modification to be applied on a data set."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataModification2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification2Code
	 * DataModification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsertNewDataSet"</li>
	 * </ul>
	 */
	public static final DataModification2Code InsertNewDataSet = new DataModification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsertNewDataSet";
			owner_lazy = () -> com.tools20022.repository.codeset.DataModification2Code.mmObject();
			codeName = DataModificationCode.InsertNewDataSet.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification2Code
	 * DataModification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeleteDataSet"</li>
	 * </ul>
	 */
	public static final DataModification2Code DeleteDataSet = new DataModification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeleteDataSet";
			owner_lazy = () -> com.tools20022.repository.codeset.DataModification2Code.mmObject();
			codeName = DataModificationCode.DeleteDataSet.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataModification2Code> codesByName = new LinkedHashMap<>();

	protected DataModification2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INSE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataModification2Code";
				definition = "Specified the type of modification to be applied on a data set.";
				trace_lazy = () -> DataModificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataModification2Code.InsertNewDataSet, com.tools20022.repository.codeset.DataModification2Code.DeleteDataSet);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InsertNewDataSet.getCodeName().get(), InsertNewDataSet);
		codesByName.put(DeleteDataSet.getCodeName().get(), DeleteDataSet);
	}

	public static DataModification2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataModification2Code[] values() {
		DataModification2Code[] values = new DataModification2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataModification2Code> {
		@Override
		public DataModification2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataModification2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}