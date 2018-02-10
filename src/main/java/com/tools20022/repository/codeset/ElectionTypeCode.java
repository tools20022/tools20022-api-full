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
import com.tools20022.repository.codeset.ElectionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of election.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ElectionTypeCode#NewElection
 * ElectionTypeCode.NewElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ElectionTypeCode#OptionChange
 * ElectionTypeCode.OptionChange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ElectionType1Code
 * ElectionType1Code}</li>
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
 * <li>"NEWM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ElectionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of election."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ElectionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * New election advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionTypeCode
	 * ElectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEWM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New election advice."</li>
	 * </ul>
	 */
	public static final ElectionTypeCode NewElection = new ElectionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewElection";
			definition = "New election advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.ElectionTypeCode.mmObject();
			codeName = "NEWM";
		}
	};
	/**
	 * Election advice which is the result of an option change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionTypeCode
	 * ElectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election advice which is the result of an option change."</li>
	 * </ul>
	 */
	public static final ElectionTypeCode OptionChange = new ElectionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionChange";
			definition = "Election advice which is the result of an option change.";
			owner_lazy = () -> com.tools20022.repository.codeset.ElectionTypeCode.mmObject();
			codeName = "CHAN";
		}
	};
	final static private LinkedHashMap<String, ElectionTypeCode> codesByName = new LinkedHashMap<>();

	protected ElectionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NEWM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ElectionTypeCode";
				definition = "Specifies the type of election.";
				derivation_lazy = () -> Arrays.asList(ElectionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ElectionTypeCode.NewElection, com.tools20022.repository.codeset.ElectionTypeCode.OptionChange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NewElection.getCodeName().get(), NewElection);
		codesByName.put(OptionChange.getCodeName().get(), OptionChange);
	}

	public static ElectionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ElectionTypeCode[] values() {
		ElectionTypeCode[] values = new ElectionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ElectionTypeCode> {
		@Override
		public ElectionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ElectionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}