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
import com.tools20022.repository.codeset.ActionCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies which type of action a user should take.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ActionCode ActionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Action2Code#mmSubmitTwin
 * Action2Code.mmSubmitTwin}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Action2Code#mmReSubmitTwin
 * Action2Code.mmReSubmitTwin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmReSubmitBaseline
 * Action2Code.mmReSubmitBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmAcceptOrRejectDataSetMisMatches
 * Action2Code.mmAcceptOrRejectDataSetMisMatches}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmAcceptOrRejectChangeOfStatus
 * Action2Code.mmAcceptOrRejectChangeOfStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmAcceptOrRejectExtensionOfStatus
 * Action2Code.mmAcceptOrRejectExtensionOfStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmWaitForBaselineEstablished
 * Action2Code.mmWaitForBaselineEstablished}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmUpdateAndResend
 * Action2Code.mmUpdateAndResend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmSubmitDataSet
 * Action2Code.mmSubmitDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmAcceptOrRejectBaselineAmendment
 * Action2Code.mmAcceptOrRejectBaselineAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmAcceptOrRejectBaselineAndRole
 * Action2Code.mmAcceptOrRejectBaselineAndRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Action2Code#mmCheckInvoiceReference
 * Action2Code.mmCheckInvoiceReference}</li>
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
 * "Action2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies which type of action a user should take."</li>
 * </ul>
 */
public class Action2Code extends ActionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitTwin"</li>
	 * </ul>
	 */
	public static final MMCode mmSubmitTwin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitTwin";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReSubmitTwin"</li>
	 * </ul>
	 */
	public static final MMCode mmReSubmitTwin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSubmitTwin";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReSubmitBaseline"</li>
	 * </ul>
	 */
	public static final MMCode mmReSubmitBaseline = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSubmitBaseline";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectDataSetMisMatches"</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptOrRejectDataSetMisMatches = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectDataSetMisMatches";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectChangeOfStatus"</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptOrRejectChangeOfStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectChangeOfStatus";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectExtensionOfStatus"</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptOrRejectExtensionOfStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectExtensionOfStatus";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitForBaselineEstablished"</li>
	 * </ul>
	 */
	public static final MMCode mmWaitForBaselineEstablished = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitForBaselineEstablished";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateAndResend"</li>
	 * </ul>
	 */
	public static final MMCode mmUpdateAndResend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateAndResend";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitDataSet"</li>
	 * </ul>
	 */
	public static final MMCode mmSubmitDataSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitDataSet";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectBaselineAmendment"</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptOrRejectBaselineAmendment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectBaselineAmendment";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptOrRejectBaselineAndRole"</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptOrRejectBaselineAndRole = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptOrRejectBaselineAndRole";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Action2Code Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckInvoiceReference"</li>
	 * </ul>
	 */
	public static final MMCode mmCheckInvoiceReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckInvoiceReference";
			owner_lazy = () -> Action2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("SBTW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Action2Code";
				definition = "Specifies which type of action a user should take.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Action2Code.mmSubmitTwin, com.tools20022.repository.codeset.Action2Code.mmReSubmitTwin, com.tools20022.repository.codeset.Action2Code.mmReSubmitBaseline,
						com.tools20022.repository.codeset.Action2Code.mmAcceptOrRejectDataSetMisMatches, com.tools20022.repository.codeset.Action2Code.mmAcceptOrRejectChangeOfStatus,
						com.tools20022.repository.codeset.Action2Code.mmAcceptOrRejectExtensionOfStatus, com.tools20022.repository.codeset.Action2Code.mmWaitForBaselineEstablished,
						com.tools20022.repository.codeset.Action2Code.mmUpdateAndResend, com.tools20022.repository.codeset.Action2Code.mmSubmitDataSet, com.tools20022.repository.codeset.Action2Code.mmAcceptOrRejectBaselineAmendment,
						com.tools20022.repository.codeset.Action2Code.mmAcceptOrRejectBaselineAndRole, com.tools20022.repository.codeset.Action2Code.mmCheckInvoiceReference);
				trace_lazy = () -> ActionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}