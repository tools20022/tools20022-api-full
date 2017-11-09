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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies which type of action a user should take.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Action1Code Action1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionCode#mmSubmitTwin
 * ActionCode.mmSubmitTwin}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionCode#mmReSubmitTwin
 * ActionCode.mmReSubmitTwin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmReSubmitBaseline
 * ActionCode.mmReSubmitBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmAcceptOrRejectDataSetMisMatches
 * ActionCode.mmAcceptOrRejectDataSetMisMatches}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmAcceptOrRejectChangeOfStatus
 * ActionCode.mmAcceptOrRejectChangeOfStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmAcceptOrRejectExtensionOfStatus
 * ActionCode.mmAcceptOrRejectExtensionOfStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmWaitForBaselineEstablished
 * ActionCode.mmWaitForBaselineEstablished}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmUpdateAndResend
 * ActionCode.mmUpdateAndResend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionCode#mmSubmitDataSet
 * ActionCode.mmSubmitDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmAcceptOrRejectBaselineAmendment
 * ActionCode.mmAcceptOrRejectBaselineAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmAcceptOrRejectBaselineAndRole
 * ActionCode.mmAcceptOrRejectBaselineAndRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionCode#mmCheckInvoiceReference
 * ActionCode.mmCheckInvoiceReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class ActionCode {

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
	public static final MMCode mmSubmitTwin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitTwin";
			definition = "Request to submit a twin baseline.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmReSubmitTwin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSubmitTwin";
			definition = "Request to resubmit a twin baseline.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmReSubmitBaseline = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSubmitBaseline";
			definition = "Request to resubmit a baseline.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmAcceptOrRejectDataSetMisMatches = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectDataSetMisMatches";
			definition = "Request to accept or reject mismatched data set(s).";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmAcceptOrRejectChangeOfStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectChangeOfStatus";
			definition = "Request to accept or reject a request for a change of status of the baseline.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmAcceptOrRejectExtensionOfStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectExtensionOfStatus";
			definition = "Request to accept or reject a request for an extension of the period of validity of the status of the baseline.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmWaitForBaselineEstablished = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitForBaselineEstablished";
			definition = "Request to wait until the baseline is established.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmUpdateAndResend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateAndResend";
			definition = "Request to update and resend.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmSubmitDataSet = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitDataSet";
			definition = "Request to submit data set(s).";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmAcceptOrRejectBaselineAmendment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectBaselineAmendment";
			definition = "Request to accept or reject a request for a baseline amendment.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmAcceptOrRejectBaselineAndRole = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectBaselineAndRole";
			definition = "Request to accept or reject a baseline and the role contained in it for the financial institution.";
			owner_lazy = () -> ActionCode.mmObject();
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
	public static final MMCode mmCheckInvoiceReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckInvoiceReference";
			definition = "Request to check invoice number because it was not found.";
			owner_lazy = () -> ActionCode.mmObject();
			codeName = "CINR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SBTW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionCode";
				definition = "Specifies which type of action a user should take.";
				code_lazy = () -> Arrays.asList(ActionCode.mmSubmitTwin, ActionCode.mmReSubmitTwin, ActionCode.mmReSubmitBaseline, ActionCode.mmAcceptOrRejectDataSetMisMatches, ActionCode.mmAcceptOrRejectChangeOfStatus,
						ActionCode.mmAcceptOrRejectExtensionOfStatus, ActionCode.mmWaitForBaselineEstablished, ActionCode.mmUpdateAndResend, ActionCode.mmSubmitDataSet, ActionCode.mmAcceptOrRejectBaselineAmendment,
						ActionCode.mmAcceptOrRejectBaselineAndRole, ActionCode.mmCheckInvoiceReference);
				derivation_lazy = () -> Arrays.asList(Action1Code.mmObject(), Action2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}