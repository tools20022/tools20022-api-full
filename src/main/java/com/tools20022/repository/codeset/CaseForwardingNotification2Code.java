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
import com.tools20022.repository.codeset.CaseForwardingNotification2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the action requested when forwarding a case. Assignees taking the
 * decision to cancel or modify to further case assignees must communicate this
 * decision to their case assigners.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code#FurtherInvestigation
 * CaseForwardingNotification2Code.FurtherInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code#RequestToCancel
 * CaseForwardingNotification2Code.RequestToCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code#RequestToModify
 * CaseForwardingNotification2Code.RequestToModify}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code#RequestDebitAuthorisation
 * CaseForwardingNotification2Code.RequestDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code#SentAdditionalInformation
 * CaseForwardingNotification2Code.SentAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code#FoundInvestigatingAgent
 * CaseForwardingNotification2Code.FoundInvestigatingAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
 * CaseForwardingNotificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FTHI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseForwardingNotification2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the action requested when forwarding a case. Assignees taking the decision to cancel or modify to further case assignees must communicate this decision to their case assigners."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CaseForwardingNotification2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code
	 * CaseForwardingNotification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherInvestigation"</li>
	 * </ul>
	 */
	public static final CaseForwardingNotification2Code FurtherInvestigation = new CaseForwardingNotification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification2Code.mmObject();
			codeName = CaseForwardingNotificationCode.FurtherInvestigation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code
	 * CaseForwardingNotification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestToCancel"</li>
	 * </ul>
	 */
	public static final CaseForwardingNotification2Code RequestToCancel = new CaseForwardingNotification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestToCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification2Code.mmObject();
			codeName = CaseForwardingNotificationCode.RequestToCancel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code
	 * CaseForwardingNotification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestToModify"</li>
	 * </ul>
	 */
	public static final CaseForwardingNotification2Code RequestToModify = new CaseForwardingNotification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestToModify";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification2Code.mmObject();
			codeName = CaseForwardingNotificationCode.RequestToModify.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code
	 * CaseForwardingNotification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDebitAuthorisation"</li>
	 * </ul>
	 */
	public static final CaseForwardingNotification2Code RequestDebitAuthorisation = new CaseForwardingNotification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDebitAuthorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification2Code.mmObject();
			codeName = CaseForwardingNotificationCode.RequestDebitAuthorisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code
	 * CaseForwardingNotification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentAdditionalInformation"</li>
	 * </ul>
	 */
	public static final CaseForwardingNotification2Code SentAdditionalInformation = new CaseForwardingNotification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentAdditionalInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification2Code.mmObject();
			codeName = CaseForwardingNotificationCode.SentAdditionalInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotification2Code
	 * CaseForwardingNotification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FoundInvestigatingAgent"</li>
	 * </ul>
	 */
	public static final CaseForwardingNotification2Code FoundInvestigatingAgent = new CaseForwardingNotification2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FoundInvestigatingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseForwardingNotification2Code.mmObject();
			codeName = CaseForwardingNotificationCode.FoundInvestigatingAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CaseForwardingNotification2Code> codesByName = new LinkedHashMap<>();

	protected CaseForwardingNotification2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FTHI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseForwardingNotification2Code";
				definition = "Specifies the action requested when forwarding a case. Assignees taking the decision to cancel or modify to further case assignees must communicate this decision to their case assigners.";
				trace_lazy = () -> CaseForwardingNotificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseForwardingNotification2Code.FurtherInvestigation, com.tools20022.repository.codeset.CaseForwardingNotification2Code.RequestToCancel,
						com.tools20022.repository.codeset.CaseForwardingNotification2Code.RequestToModify, com.tools20022.repository.codeset.CaseForwardingNotification2Code.RequestDebitAuthorisation,
						com.tools20022.repository.codeset.CaseForwardingNotification2Code.SentAdditionalInformation, com.tools20022.repository.codeset.CaseForwardingNotification2Code.FoundInvestigatingAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FurtherInvestigation.getCodeName().get(), FurtherInvestigation);
		codesByName.put(RequestToCancel.getCodeName().get(), RequestToCancel);
		codesByName.put(RequestToModify.getCodeName().get(), RequestToModify);
		codesByName.put(RequestDebitAuthorisation.getCodeName().get(), RequestDebitAuthorisation);
		codesByName.put(SentAdditionalInformation.getCodeName().get(), SentAdditionalInformation);
		codesByName.put(FoundInvestigatingAgent.getCodeName().get(), FoundInvestigatingAgent);
	}

	public static CaseForwardingNotification2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CaseForwardingNotification2Code[] values() {
		CaseForwardingNotification2Code[] values = new CaseForwardingNotification2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CaseForwardingNotification2Code> {
		@Override
		public CaseForwardingNotification2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CaseForwardingNotification2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}