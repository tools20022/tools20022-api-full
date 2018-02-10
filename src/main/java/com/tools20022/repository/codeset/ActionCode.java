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
import com.tools20022.repository.codeset.ActionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which type of action a user should take.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionCode#SubmitTwin
 * ActionCode.SubmitTwin}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionCode#ReSubmitTwin
 * ActionCode.ReSubmitTwin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#ReSubmitBaseline
 * ActionCode.ReSubmitBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#AcceptOrRejectDataSetMisMatches
 * ActionCode.AcceptOrRejectDataSetMisMatches}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#AcceptOrRejectChangeOfStatus
 * ActionCode.AcceptOrRejectChangeOfStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#AcceptOrRejectExtensionOfStatus
 * ActionCode.AcceptOrRejectExtensionOfStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#WaitForBaselineEstablished
 * ActionCode.WaitForBaselineEstablished}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionCode#UpdateAndResend
 * ActionCode.UpdateAndResend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionCode#SubmitDataSet
 * ActionCode.SubmitDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#AcceptOrRejectBaselineAmendment
 * ActionCode.AcceptOrRejectBaselineAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#AcceptOrRejectBaselineAndRole
 * ActionCode.AcceptOrRejectBaselineAndRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#CheckInvoiceReference
 * ActionCode.CheckInvoiceReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
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
 * <li>"SBTW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies which type of action a user should take."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ActionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Request to submit a twin baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBTW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitTwin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to submit a twin baseline."</li>
	 * </ul>
	 */
	public static final ActionCode SubmitTwin = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitTwin";
			definition = "Request to submit a twin baseline.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "SBTW";
		}
	};
	/**
	 * Request to resubmit a twin baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSTW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReSubmitTwin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to resubmit a twin baseline."</li>
	 * </ul>
	 */
	public static final ActionCode ReSubmitTwin = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSubmitTwin";
			definition = "Request to resubmit a twin baseline.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "RSTW";
		}
	};
	/**
	 * Request to resubmit a baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReSubmitBaseline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to resubmit a baseline."</li>
	 * </ul>
	 */
	public static final ActionCode ReSubmitBaseline = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSubmitBaseline";
			definition = "Request to resubmit a baseline.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "RSBS";
		}
	};
	/**
	 * Request to accept or reject mismatched data set(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectDataSetMisMatches"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to accept or reject mismatched data set(s)."</li>
	 * </ul>
	 */
	public static final ActionCode AcceptOrRejectDataSetMisMatches = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectDataSetMisMatches";
			definition = "Request to accept or reject mismatched data set(s).";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "ARDM";
		}
	};
	/**
	 * Request to accept or reject a request for a change of status of the
	 * baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectChangeOfStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to accept or reject a request for a change of status of the baseline."
	 * </li>
	 * </ul>
	 */
	public static final ActionCode AcceptOrRejectChangeOfStatus = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectChangeOfStatus";
			definition = "Request to accept or reject a request for a change of status of the baseline.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "ARCS";
		}
	};
	/**
	 * Request to accept or reject a request for an extension of the period of
	 * validity of the status of the baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectExtensionOfStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to accept or reject a request for an extension of the period of validity of the status of the baseline."
	 * </li>
	 * </ul>
	 */
	public static final ActionCode AcceptOrRejectExtensionOfStatus = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectExtensionOfStatus";
			definition = "Request to accept or reject a request for an extension of the period of validity of the status of the baseline.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "ARES";
		}
	};
	/**
	 * Request to wait until the baseline is established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WAIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitForBaselineEstablished"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to wait until the baseline is established."</li>
	 * </ul>
	 */
	public static final ActionCode WaitForBaselineEstablished = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitForBaselineEstablished";
			definition = "Request to wait until the baseline is established.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "WAIT";
		}
	};
	/**
	 * Request to update and resend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateAndResend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to update and resend."</li>
	 * </ul>
	 */
	public static final ActionCode UpdateAndResend = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateAndResend";
			definition = "Request to update and resend.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "UPDT";
		}
	};
	/**
	 * Request to submit data set(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to submit data set(s)."</li>
	 * </ul>
	 */
	public static final ActionCode SubmitDataSet = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitDataSet";
			definition = "Request to submit data set(s).";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "SBDS";
		}
	};
	/**
	 * Request to accept or reject a request for a baseline amendment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectBaselineAmendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to accept or reject a request for a baseline amendment."</li>
	 * </ul>
	 */
	public static final ActionCode AcceptOrRejectBaselineAmendment = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectBaselineAmendment";
			definition = "Request to accept or reject a request for a baseline amendment.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "ARBA";
		}
	};
	/**
	 * Request to accept or reject a baseline and the role contained in it for
	 * the financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectBaselineAndRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to accept or reject a baseline and the role contained in it for the financial institution."
	 * </li>
	 * </ul>
	 */
	public static final ActionCode AcceptOrRejectBaselineAndRole = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectBaselineAndRole";
			definition = "Request to accept or reject a baseline and the role contained in it for the financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "ARRO";
		}
	};
	/**
	 * Request to check invoice number because it was not found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckInvoiceReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to check invoice number because it was not found."
	 * </li>
	 * </ul>
	 */
	public static final ActionCode CheckInvoiceReference = new ActionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckInvoiceReference";
			definition = "Request to check invoice number because it was not found.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionCode.mmObject();
			codeName = "CINR";
		}
	};
	final static private LinkedHashMap<String, ActionCode> codesByName = new LinkedHashMap<>();

	protected ActionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SBTW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionCode";
				definition = "Specifies which type of action a user should take.";
				derivation_lazy = () -> Arrays.asList(Action1Code.mmObject(), Action2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionCode.SubmitTwin, com.tools20022.repository.codeset.ActionCode.ReSubmitTwin, com.tools20022.repository.codeset.ActionCode.ReSubmitBaseline,
						com.tools20022.repository.codeset.ActionCode.AcceptOrRejectDataSetMisMatches, com.tools20022.repository.codeset.ActionCode.AcceptOrRejectChangeOfStatus,
						com.tools20022.repository.codeset.ActionCode.AcceptOrRejectExtensionOfStatus, com.tools20022.repository.codeset.ActionCode.WaitForBaselineEstablished, com.tools20022.repository.codeset.ActionCode.UpdateAndResend,
						com.tools20022.repository.codeset.ActionCode.SubmitDataSet, com.tools20022.repository.codeset.ActionCode.AcceptOrRejectBaselineAmendment, com.tools20022.repository.codeset.ActionCode.AcceptOrRejectBaselineAndRole,
						com.tools20022.repository.codeset.ActionCode.CheckInvoiceReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SubmitTwin.getCodeName().get(), SubmitTwin);
		codesByName.put(ReSubmitTwin.getCodeName().get(), ReSubmitTwin);
		codesByName.put(ReSubmitBaseline.getCodeName().get(), ReSubmitBaseline);
		codesByName.put(AcceptOrRejectDataSetMisMatches.getCodeName().get(), AcceptOrRejectDataSetMisMatches);
		codesByName.put(AcceptOrRejectChangeOfStatus.getCodeName().get(), AcceptOrRejectChangeOfStatus);
		codesByName.put(AcceptOrRejectExtensionOfStatus.getCodeName().get(), AcceptOrRejectExtensionOfStatus);
		codesByName.put(WaitForBaselineEstablished.getCodeName().get(), WaitForBaselineEstablished);
		codesByName.put(UpdateAndResend.getCodeName().get(), UpdateAndResend);
		codesByName.put(SubmitDataSet.getCodeName().get(), SubmitDataSet);
		codesByName.put(AcceptOrRejectBaselineAmendment.getCodeName().get(), AcceptOrRejectBaselineAmendment);
		codesByName.put(AcceptOrRejectBaselineAndRole.getCodeName().get(), AcceptOrRejectBaselineAndRole);
		codesByName.put(CheckInvoiceReference.getCodeName().get(), CheckInvoiceReference);
	}

	public static ActionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ActionCode[] values() {
		ActionCode[] values = new ActionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ActionCode> {
		@Override
		public ActionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ActionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}