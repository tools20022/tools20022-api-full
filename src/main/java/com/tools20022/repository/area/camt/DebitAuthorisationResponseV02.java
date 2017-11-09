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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msg.DebitAuthorisationConfirmation2;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The Debit Authorisation Response message is sent by an account owner to its
 * account servicing institution. This message is used to approve or reject a
 * debit authorisation request.<br>
 * <b>Usage</b><br>
 * The Debit Authorisation Response message is used to reply to a Debit
 * Authorisation Request message.<br>
 * The Debit Authorisation Response message covers one and only one payment
 * instruction at a time. If an account owner needs to reply to several Debit
 * Authorisation Request messages, then multiple Debit Authorisation Response
 * messages must be sent.<br>
 * The Debit Authorisation Response message indicates whether the account owner
 * agrees with the request by means of a code. It also allows further details to
 * be given about the debit authorisation, such as acceptable amount and value
 * date for the debit.<br>
 * The Debit Authorisation Response message must be used exclusively between the
 * account owner and the account servicing institution. It must not be used in
 * place of a Resolution Of Investigation message between subsequent agents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.036.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DbtAuthstnRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV02#mmAssignment
 * DebitAuthorisationResponseV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV02#mmCase
 * DebitAuthorisationResponseV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV02#mmConfirmation
 * DebitAuthorisationResponseV02.mmConfirmation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitAuthorisationResponseV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Debit Authorisation Response message is sent by an account owner to its account servicing institution. This message is used to approve or reject a debit authorisation request.\r\nUsage\r\nThe Debit Authorisation Response message is used to reply to a Debit Authorisation Request message.\r\nThe Debit Authorisation Response message covers one and only one payment instruction at a time. If an account owner needs to reply to several Debit Authorisation Request messages, then multiple Debit Authorisation Response messages must be sent.\r\nThe Debit Authorisation Response message indicates whether the account owner agrees with the request by means of a code. It also allows further details to be given about the debit authorisation, such as acceptable amount and value date for the debit.\r\nThe Debit Authorisation Response message must be used exclusively between the account owner and the account servicing institution. It must not be used in place of a Resolution Of Investigation message between subsequent agents."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03
 * DebitAuthorisationResponseV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponse
 * DebitAuthorisationResponse}</li>
 * </ul>
 */
public class DebitAuthorisationResponseV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected CaseAssignment2 assignment;
	/**
	 * Identifies the assignment of an investigation case from an assigner to an
	 * assignee. Usage: The Assigner must be the sender of this confirmation and
	 * the Assignee must be the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}
	};
	protected Case2 case_;
	/**
	 * Identifies the investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case2.mmObject();
		}
	};
	protected DebitAuthorisationConfirmation2 confirmation;
	/**
	 * Indicates if the debit authorisation is granted or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2
	 * DebitAuthorisationConfirmation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the debit authorisation is granted or not."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Indicates if the debit authorisation is granted or not.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DebitAuthorisationConfirmation2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisationResponseV02";
				definition = "Scope\r\nThe Debit Authorisation Response message is sent by an account owner to its account servicing institution. This message is used to approve or reject a debit authorisation request.\r\nUsage\r\nThe Debit Authorisation Response message is used to reply to a Debit Authorisation Request message.\r\nThe Debit Authorisation Response message covers one and only one payment instruction at a time. If an account owner needs to reply to several Debit Authorisation Request messages, then multiple Debit Authorisation Response messages must be sent.\r\nThe Debit Authorisation Response message indicates whether the account owner agrees with the request by means of a code. It also allows further details to be given about the debit authorisation, such as acceptable amount and value date for the debit.\r\nThe Debit Authorisation Response message must be used exclusively between the account owner and the account servicing institution. It must not be used in place of a Resolution Of Investigation message between subsequent agents.";
				nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationResponseV03.mmObject());
				previousVersion_lazy = () -> DebitAuthorisationResponse.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "DbtAuthstnRspn";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(DebitAuthorisationResponseV02.mmAssignment, DebitAuthorisationResponseV02.mmCase, DebitAuthorisationResponseV02.mmConfirmation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "036";
						version = "02";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public void setAssignment(CaseAssignment2 assignment) {
		this.assignment = assignment;
	}

	public Case2 getCase() {
		return case_;
	}

	public void setCase(Case2 case_) {
		this.case_ = case_;
	}

	public DebitAuthorisationConfirmation2 getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(DebitAuthorisationConfirmation2 confirmation) {
		this.confirmation = confirmation;
	}
}