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
 * Specifies the workflow status of the announcement record based on validation
 * procedure.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
 * EventWorkflowStatus1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventWorkflowStatus2Code
 * EventWorkflowStatus2Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmApproved
 * EventWorkflowStatusCode.mmApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmConditionallyApproved
 * EventWorkflowStatusCode.mmConditionallyApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmCancelled
 * EventWorkflowStatusCode.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmInConflict
 * EventWorkflowStatusCode.mmInConflict}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmDeleted
 * EventWorkflowStatusCode.mmDeleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmIncomplete
 * EventWorkflowStatusCode.mmIncomplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmNotSupported
 * EventWorkflowStatusCode.mmNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmPendingApproval
 * EventWorkflowStatusCode.mmPendingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmPendingCancelled
 * EventWorkflowStatusCode.mmPendingCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmPendingConditionalApproval
 * EventWorkflowStatusCode.mmPendingConditionalApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmPendingDeleted
 * EventWorkflowStatusCode.mmPendingDeleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#mmPendingNotSupported
 * EventWorkflowStatusCode.mmPendingNotSupported}</li>
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
 * <li>"WSAP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventWorkflowStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the workflow status of the announcement record based on validation procedure."
 * </li>
 * </ul>
 */
public class EventWorkflowStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * All of the required data has been populated. Any conflicting data has
	 * been resolved. Either all information was in agreement (STP) or if manual
	 * validation was necessary authorised review and changes/updates were
	 * performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All of the required data has been populated. Any conflicting data has been resolved. Either all information was in agreement (STP) or if manual validation was necessary  authorised review and changes/updates were performed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmApproved = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			definition = "All of the required data has been populated. Any conflicting data has been resolved. Either all information was in agreement (STP) or if manual validation was necessary  authorised review and changes/updates were performed.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSAP";
		}
	};
	/**
	 * Announcement has been confirmed but not all of the required data is
	 * available. Event was validated or specific STP criteria was met, however
	 * data is still pending confirmation of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyApproved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Announcement has been confirmed but not all of the required data is available. Event was validated or specific STP criteria was met, however data is still pending confirmation of the event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConditionallyApproved = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyApproved";
			definition = "Announcement has been confirmed but not all of the required data is available. Event was validated or specific STP criteria was met, however data is still pending confirmation of the event.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSCA";
		}
	};
	/**
	 * Validation has determined event is being cancelled by the issuer/offeror.
	 * Either all information was in agreement (STP) or if manual validation was
	 * necessary authorised review and changes/updates were performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation has determined event is being cancelled by the issuer/offeror. Either all information was in agreement (STP) or if manual validation was necessary authorised review and changes/updates were performed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancelled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Validation has determined event is being cancelled by the issuer/offeror. Either all information was in agreement (STP) or if manual validation was necessary authorised review and changes/updates were performed.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSCN";
		}
	};
	/**
	 * Two or more sources disagree on one or more data elements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InConflict"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Two or more sources disagree on one or more data elements."</li>
	 * </ul>
	 */
	public static final MMCode mmInConflict = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InConflict";
			definition = "Two or more sources disagree on one or more data elements.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSCT";
		}
	};
	/**
	 * Announcement record has been deleted/ removed as an invalid record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Announcement record has been deleted/ removed as an invalid record."</li>
	 * </ul>
	 */
	public static final MMCode mmDeleted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Announcement record has been deleted/ removed as an invalid record.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSDE";
		}
	};
	/**
	 * Required data is not available. Announcement record cannot be verified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incomplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Required data is not available. Announcement record cannot be verified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIncomplete = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incomplete";
			definition = "Required data is not available. Announcement record cannot be verified.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSIN";
		}
	};
	/**
	 * Announcement record is not supported by validation service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Announcement record is not supported by validation service."</li>
	 * </ul>
	 */
	public static final MMCode mmNotSupported = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			definition = "Announcement record is not supported by validation service.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSNS";
		}
	};
	/**
	 * Validation review was performed and event has been modified. Event is
	 * pending authorised approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation review was performed and event has been modified. Event is pending authorised approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingApproval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingApproval";
			definition = "Validation review was performed and event has been modified. Event is pending authorised approval.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSPA";
		}
	};
	/**
	 * Validation has determined event is being cancelled by the issuer/offeror.
	 * Pending authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation has determined event is being cancelled by the issuer/offeror. Pending authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingCancelled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancelled";
			definition = "Validation has determined event is being cancelled by the issuer/offeror. Pending authorisation.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSPC";
		}
	};
	/**
	 * Validation review has been performed and event has been modified.
	 * Announcement has been confirmed but not all of the required data is
	 * available. Even record is pending authorised approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConditionalApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation review has been performed and event has been modified. Announcement has been confirmed but not all of the required data is available. Even record is pending authorised approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingConditionalApproval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConditionalApproval";
			definition = "Validation review has been performed and event has been modified. Announcement has been confirmed but not all of the required data is available. Even record is pending authorised approval.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSPN";
		}
	};
	/**
	 * Validation has determined the announcement record to be invalid. Pending
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation has determined the announcement record to be invalid. Pending authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingDeleted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeleted";
			definition = "Validation has determined the announcement record to be invalid. Pending authorisation.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSPD";
		}
	};
	/**
	 * Validation has determined that the record is not supported. Pending
	 * authorisations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
	 * EventWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WSPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingNotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation has determined that the record is not supported. Pending authorisations."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingNotSupported = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingNotSupported";
			definition = "Validation has determined that the record is not supported. Pending authorisations.";
			owner_lazy = () -> EventWorkflowStatusCode.mmObject();
			codeName = "WSPS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("WSAP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventWorkflowStatusCode";
				definition = "Specifies the workflow status of the announcement record based on validation procedure.";
				code_lazy = () -> Arrays.asList(EventWorkflowStatusCode.mmApproved, EventWorkflowStatusCode.mmConditionallyApproved, EventWorkflowStatusCode.mmCancelled, EventWorkflowStatusCode.mmInConflict,
						EventWorkflowStatusCode.mmDeleted, EventWorkflowStatusCode.mmIncomplete, EventWorkflowStatusCode.mmNotSupported, EventWorkflowStatusCode.mmPendingApproval, EventWorkflowStatusCode.mmPendingCancelled,
						EventWorkflowStatusCode.mmPendingConditionalApproval, EventWorkflowStatusCode.mmPendingDeleted, EventWorkflowStatusCode.mmPendingNotSupported);
				derivation_lazy = () -> Arrays.asList(EventWorkflowStatus1Code.mmObject(), EventWorkflowStatus2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}