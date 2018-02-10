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
import com.tools20022.repository.codeset.CustodianActionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies custodian activity codes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianActionCode#Research
 * CustodianActionCode.Research}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianActionCode#SendInfo
 * CustodianActionCode.SendInfo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianActionCode#Disagrees
 * CustodianActionCode.Disagrees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianActionCode#NoAction
 * CustodianActionCode.NoAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CustodianAction1Code
 * CustodianAction1Code}</li>
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
 * <li>"RSCH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodianActionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies custodian activity codes."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CustodianActionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Custodian is researching pending issues raised by the validation service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianActionCode
	 * CustodianActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Research"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Custodian is researching pending issues raised by the validation service."
	 * </li>
	 * </ul>
	 */
	public static final CustodianActionCode Research = new CustodianActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Research";
			definition = "Custodian is researching pending issues raised by the validation service.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianActionCode.mmObject();
			codeName = "RSCH";
		}
	};
	/**
	 * Custodian is expected to send updated information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianActionCode
	 * CustodianActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendInfo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian is expected to send updated information."</li>
	 * </ul>
	 */
	public static final CustodianActionCode SendInfo = new CustodianActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendInfo";
			definition = "Custodian is expected to send updated information.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianActionCode.mmObject();
			codeName = "SEND";
		}
	};
	/**
	 * Custodian disagrees with the validation service and will take no further
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianActionCode
	 * CustodianActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disagrees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Custodian disagrees with the validation service and will take no further action."
	 * </li>
	 * </ul>
	 */
	public static final CustodianActionCode Disagrees = new CustodianActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disagrees";
			definition = "Custodian disagrees with the validation service and will take no further action.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianActionCode.mmObject();
			codeName = "DISS";
		}
	};
	/**
	 * No action required by the custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianActionCode
	 * CustodianActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No action required by the custodian."</li>
	 * </ul>
	 */
	public static final CustodianActionCode NoAction = new CustodianActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			definition = "No action required by the custodian.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianActionCode.mmObject();
			codeName = "NOAC";
		}
	};
	final static private LinkedHashMap<String, CustodianActionCode> codesByName = new LinkedHashMap<>();

	protected CustodianActionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RSCH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodianActionCode";
				definition = "Specifies custodian activity codes.";
				derivation_lazy = () -> Arrays.asList(CustodianAction1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustodianActionCode.Research, com.tools20022.repository.codeset.CustodianActionCode.SendInfo,
						com.tools20022.repository.codeset.CustodianActionCode.Disagrees, com.tools20022.repository.codeset.CustodianActionCode.NoAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Research.getCodeName().get(), Research);
		codesByName.put(SendInfo.getCodeName().get(), SendInfo);
		codesByName.put(Disagrees.getCodeName().get(), Disagrees);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
	}

	public static CustodianActionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CustodianActionCode[] values() {
		CustodianActionCode[] values = new CustodianActionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CustodianActionCode> {
		@Override
		public CustodianActionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CustodianActionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}