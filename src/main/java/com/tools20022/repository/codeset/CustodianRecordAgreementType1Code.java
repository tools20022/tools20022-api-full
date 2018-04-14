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
import com.tools20022.repository.codeset.CustodianRecordAgreementType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementType1Code#Agree
 * CustodianRecordAgreementType1Code.Agree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementType1Code#Disagree
 * CustodianRecordAgreementType1Code.Disagree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementType1Code#NoComposite
 * CustodianRecordAgreementType1Code.NoComposite}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementTypeCode
 * CustodianRecordAgreementTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodianRecordAgreementType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the state of the agreement of the custodian record when compared to composite record."
 * </li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CustodianRecordAgreementType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementType1Code
	 * CustodianRecordAgreementType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CustodianRecordAgreementType1Code Agree = new CustodianRecordAgreementType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agree";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordAgreementType1Code.mmObject();
			codeName = CustodianRecordAgreementTypeCode.Agree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementType1Code
	 * CustodianRecordAgreementType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disagree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CustodianRecordAgreementType1Code Disagree = new CustodianRecordAgreementType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disagree";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordAgreementType1Code.mmObject();
			codeName = CustodianRecordAgreementTypeCode.Disagree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementType1Code
	 * CustodianRecordAgreementType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoComposite"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CustodianRecordAgreementType1Code NoComposite = new CustodianRecordAgreementType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoComposite";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordAgreementType1Code.mmObject();
			codeName = CustodianRecordAgreementTypeCode.NoComposite.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CustodianRecordAgreementType1Code> codesByName = new LinkedHashMap<>();

	protected CustodianRecordAgreementType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGRE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodianRecordAgreementType1Code";
				definition = "Specifies the state of the agreement of the custodian record when compared to composite record.";
				trace_lazy = () -> CustodianRecordAgreementTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustodianRecordAgreementType1Code.Agree, com.tools20022.repository.codeset.CustodianRecordAgreementType1Code.Disagree,
						com.tools20022.repository.codeset.CustodianRecordAgreementType1Code.NoComposite);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agree.getCodeName().get(), Agree);
		codesByName.put(Disagree.getCodeName().get(), Disagree);
		codesByName.put(NoComposite.getCodeName().get(), NoComposite);
	}

	public static CustodianRecordAgreementType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CustodianRecordAgreementType1Code[] values() {
		CustodianRecordAgreementType1Code[] values = new CustodianRecordAgreementType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CustodianRecordAgreementType1Code> {
		@Override
		public CustodianRecordAgreementType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CustodianRecordAgreementType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}