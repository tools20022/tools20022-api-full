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
import com.tools20022.repository.codeset.EventWorkflowStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the workflow status of the announcement record based on validation
 * procedure.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#Approved
 * EventWorkflowStatusCode.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#ConditionallyApproved
 * EventWorkflowStatusCode.ConditionallyApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#Cancelled
 * EventWorkflowStatusCode.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#InConflict
 * EventWorkflowStatusCode.InConflict}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#Deleted
 * EventWorkflowStatusCode.Deleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#Incomplete
 * EventWorkflowStatusCode.Incomplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#NotSupported
 * EventWorkflowStatusCode.NotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#PendingApproval
 * EventWorkflowStatusCode.PendingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#PendingCancelled
 * EventWorkflowStatusCode.PendingCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#PendingConditionalApproval
 * EventWorkflowStatusCode.PendingConditionalApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#PendingDeleted
 * EventWorkflowStatusCode.PendingDeleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode#PendingNotSupported
 * EventWorkflowStatusCode.PendingNotSupported}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
 * EventWorkflowStatus1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventWorkflowStatus2Code
 * EventWorkflowStatus2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventWorkflowStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the workflow status of the announcement record based on validation procedure."
 * </li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventWorkflowStatusCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All of the required data has been populated. Any conflicting data has been resolved. Either all information was in agreement (STP) or if manual validation was necessary authorised review and changes/updates were performed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode Approved = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			definition = "All of the required data has been populated. Any conflicting data has been resolved. Either all information was in agreement (STP) or if manual validation was necessary authorised review and changes/updates were performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyApproved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Announcement has been confirmed but not all of the required data is available. Event was validated or specific STP criteria was met, however data is still pending confirmation of the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode ConditionallyApproved = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyApproved";
			definition = "Announcement has been confirmed but not all of the required data is available. Event was validated or specific STP criteria was met, however data is still pending confirmation of the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation has determined event is being cancelled by the issuer/offeror. Either all information was in agreement (STP) or if manual validation was necessary authorised review and changes/updates were performed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode Cancelled = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Validation has determined event is being cancelled by the issuer/offeror. Either all information was in agreement (STP) or if manual validation was necessary authorised review and changes/updates were performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InConflict"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Two or more sources disagree on one or more data elements."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode InConflict = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InConflict";
			definition = "Two or more sources disagree on one or more data elements.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Announcement record has been deleted/ removed as an invalid record."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode Deleted = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Announcement record has been deleted/ removed as an invalid record.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incomplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Required data is not available. Announcement record cannot be verified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode Incomplete = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incomplete";
			definition = "Required data is not available. Announcement record cannot be verified.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Announcement record is not supported by validation service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode NotSupported = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			definition = "Announcement record is not supported by validation service.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation review was performed and event has been modified. Event is pending authorised approval."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode PendingApproval = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingApproval";
			definition = "Validation review was performed and event has been modified. Event is pending authorised approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation has determined event is being cancelled by the issuer/offeror. Pending authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode PendingCancelled = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancelled";
			definition = "Validation has determined event is being cancelled by the issuer/offeror. Pending authorisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConditionalApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation review has been performed and event has been modified. Announcement has been confirmed but not all of the required data is available. Even record is pending authorised approval."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode PendingConditionalApproval = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConditionalApproval";
			definition = "Validation review has been performed and event has been modified. Announcement has been confirmed but not all of the required data is available. Even record is pending authorised approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation has determined the announcement record to be invalid. Pending authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode PendingDeleted = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeleted";
			definition = "Validation has determined the announcement record to be invalid. Pending authorisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingNotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation has determined that the record is not supported. Pending authorisations."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EventWorkflowStatusCode PendingNotSupported = new EventWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingNotSupported";
			definition = "Validation has determined that the record is not supported. Pending authorisations.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatusCode.mmObject();
			codeName = "WSPS";
		}
	};
	final static private LinkedHashMap<String, EventWorkflowStatusCode> codesByName = new LinkedHashMap<>();

	protected EventWorkflowStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WSAP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventWorkflowStatusCode";
				definition = "Specifies the workflow status of the announcement record based on validation procedure.";
				derivation_lazy = () -> Arrays.asList(EventWorkflowStatus1Code.mmObject(), EventWorkflowStatus2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventWorkflowStatusCode.Approved, com.tools20022.repository.codeset.EventWorkflowStatusCode.ConditionallyApproved,
						com.tools20022.repository.codeset.EventWorkflowStatusCode.Cancelled, com.tools20022.repository.codeset.EventWorkflowStatusCode.InConflict, com.tools20022.repository.codeset.EventWorkflowStatusCode.Deleted,
						com.tools20022.repository.codeset.EventWorkflowStatusCode.Incomplete, com.tools20022.repository.codeset.EventWorkflowStatusCode.NotSupported,
						com.tools20022.repository.codeset.EventWorkflowStatusCode.PendingApproval, com.tools20022.repository.codeset.EventWorkflowStatusCode.PendingCancelled,
						com.tools20022.repository.codeset.EventWorkflowStatusCode.PendingConditionalApproval, com.tools20022.repository.codeset.EventWorkflowStatusCode.PendingDeleted,
						com.tools20022.repository.codeset.EventWorkflowStatusCode.PendingNotSupported);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(ConditionallyApproved.getCodeName().get(), ConditionallyApproved);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(InConflict.getCodeName().get(), InConflict);
		codesByName.put(Deleted.getCodeName().get(), Deleted);
		codesByName.put(Incomplete.getCodeName().get(), Incomplete);
		codesByName.put(NotSupported.getCodeName().get(), NotSupported);
		codesByName.put(PendingApproval.getCodeName().get(), PendingApproval);
		codesByName.put(PendingCancelled.getCodeName().get(), PendingCancelled);
		codesByName.put(PendingConditionalApproval.getCodeName().get(), PendingConditionalApproval);
		codesByName.put(PendingDeleted.getCodeName().get(), PendingDeleted);
		codesByName.put(PendingNotSupported.getCodeName().get(), PendingNotSupported);
	}

	public static EventWorkflowStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventWorkflowStatusCode[] values() {
		EventWorkflowStatusCode[] values = new EventWorkflowStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventWorkflowStatusCode> {
		@Override
		public EventWorkflowStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventWorkflowStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}