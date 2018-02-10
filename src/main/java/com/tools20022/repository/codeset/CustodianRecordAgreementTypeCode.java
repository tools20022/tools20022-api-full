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
import com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the state of the agreement of the custodian record when compared to
 * composite record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode#Agree
 * CustodianRecordAgreementTypeCode.Agree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode#Disagree
 * CustodianRecordAgreementTypeCode.Disagree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode#NoComposite
 * CustodianRecordAgreementTypeCode.NoComposite}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementType1Code
 * CustodianRecordAgreementType1Code}</li>
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
 * <li>"AGRE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodianRecordAgreementTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the state of the agreement of the custodian record when compared to composite record."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CustodianRecordAgreementTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Custodian record agrees with the composite record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode
	 * CustodianRecordAgreementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian record agrees with the composite record."</li>
	 * </ul>
	 */
	public static final CustodianRecordAgreementTypeCode Agree = new CustodianRecordAgreementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agree";
			definition = "Custodian record agrees with the composite record.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode.mmObject();
			codeName = "AGRE";
		}
	};
	/**
	 * Custodian record disagrees with the composite record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode
	 * CustodianRecordAgreementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disagree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian record disagrees with the composite record."</li>
	 * </ul>
	 */
	public static final CustodianRecordAgreementTypeCode Disagree = new CustodianRecordAgreementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disagree";
			definition = "Custodian record disagrees with the composite record.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode.mmObject();
			codeName = "DAGR";
		}
	};
	/**
	 * No composite record available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode
	 * CustodianRecordAgreementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoComposite"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No composite record available."</li>
	 * </ul>
	 */
	public static final CustodianRecordAgreementTypeCode NoComposite = new CustodianRecordAgreementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoComposite";
			definition = "No composite record available.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode.mmObject();
			codeName = "NCOP";
		}
	};
	final static private LinkedHashMap<String, CustodianRecordAgreementTypeCode> codesByName = new LinkedHashMap<>();

	protected CustodianRecordAgreementTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGRE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodianRecordAgreementTypeCode";
				definition = "Specifies the state of the agreement of the custodian record when compared to composite record.";
				derivation_lazy = () -> Arrays.asList(CustodianRecordAgreementType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode.Agree, com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode.Disagree,
						com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode.NoComposite);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agree.getCodeName().get(), Agree);
		codesByName.put(Disagree.getCodeName().get(), Disagree);
		codesByName.put(NoComposite.getCodeName().get(), NoComposite);
	}

	public static CustodianRecordAgreementTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CustodianRecordAgreementTypeCode[] values() {
		CustodianRecordAgreementTypeCode[] values = new CustodianRecordAgreementTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CustodianRecordAgreementTypeCode> {
		@Override
		public CustodianRecordAgreementTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CustodianRecordAgreementTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}