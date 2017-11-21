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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.choice.Party7Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestigationCase;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to represent the assignment of a case to a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CaseAssignment2#mmIdentification
 * CaseAssignment2.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment2#mmAssigner
 * CaseAssignment2.mmAssigner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment2#mmAssignee
 * CaseAssignment2.mmAssignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CaseAssignment2#mmCreationDateTime
 * CaseAssignment2.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestigationCase
 * InvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV01#mmAssignment
 * CustomerPaymentCancellationRequestV01.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV01#mmAssignment
 * FIToFIPaymentCancellationRequestV01.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmAssignment
 * RequestToModifyPaymentV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV03#mmAssignment
 * UnableToApplyV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03#mmAssignment
 * ClaimNonReceiptV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV03#mmAssignment
 * AdditionalPaymentInformationV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmAssignment
 * ResolutionOfInvestigationV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03#mmAssignment
 * NotificationOfCaseAssignmentV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV03#mmAssignment
 * RejectInvestigationV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV02#mmAssignment
 * CancelCaseAssignmentV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV03#mmAssignment
 * RequestForDuplicateV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DuplicateV03#mmAssignment
 * DuplicateV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02#mmAssignment
 * ProprietaryFormatInvestigationV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV02#mmAssignment
 * DebitAuthorisationResponseV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03#mmAssignment
 * DebitAuthorisationRequestV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV03#mmNewAssignment
 * CaseStatusReportV03.mmNewAssignment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseAssignment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to represent the assignment of a case to a party."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CaseAssignment2", propOrder = {"identification", "assigner", "assignee", "creationDateTime"})
public class CaseAssignment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Uniquely identifies the case assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmAssignmentIdentification
	 * InvestigationCase.mmAssignmentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies the case assignment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestigationCase.mmAssignmentIdentification;
			componentContext_lazy = () -> CaseAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Party7Choice assigner;
	/**
	 * Party who assigns the case. Usage: This is also the sender of the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party7Choice
	 * Party7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who assigns the case. \nUsage: This is also the sender of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssigner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CaseAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party who assigns the case. \nUsage: This is also the sender of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party7Choice.mmObject();
		}
	};
	protected Party7Choice assignee;
	/**
	 * Party to which the case is assigned. Usage: This is also the receiver of
	 * the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party7Choice
	 * Party7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the case is assigned.\nUsage: This is also the receiver of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssignee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CaseAssignment2.mmObject();
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party to which the case is assigned.\nUsage: This is also the receiver of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party7Choice.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date and time at which the assignment was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmCreationDateTime
	 * InvestigationCase.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the assignment was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestigationCase.mmCreationDateTime;
			componentContext_lazy = () -> CaseAssignment2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the assignment was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CaseAssignment2.mmIdentification, CaseAssignment2.mmAssigner, CaseAssignment2.mmAssignee, CaseAssignment2.mmCreationDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentCancellationRequestV01.mmAssignment, FIToFIPaymentCancellationRequestV01.mmAssignment, RequestToModifyPaymentV03.mmAssignment, UnableToApplyV03.mmAssignment,
						ClaimNonReceiptV03.mmAssignment, AdditionalPaymentInformationV03.mmAssignment, ResolutionOfInvestigationV03.mmAssignment, NotificationOfCaseAssignmentV03.mmAssignment, RejectInvestigationV03.mmAssignment,
						CancelCaseAssignmentV02.mmAssignment, RequestForDuplicateV03.mmAssignment, DuplicateV03.mmAssignment, ProprietaryFormatInvestigationV02.mmAssignment, DebitAuthorisationResponseV02.mmAssignment,
						DebitAuthorisationRequestV03.mmAssignment, CaseStatusReportV03.mmNewAssignment);
				trace_lazy = () -> InvestigationCase.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseAssignment2";
				definition = "Set of elements used to represent the assignment of a case to a party.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Assgnr", required = true)
	public Party7Choice getAssigner() {
		return assigner;
	}

	public void setAssigner(Party7Choice assigner) {
		this.assigner = assigner;
	}

	@XmlElement(name = "Assgne", required = true)
	public Party7Choice getAssignee() {
		return assignee;
	}

	public void setAssignee(Party7Choice assignee) {
		this.assignee = assignee;
	}

	@XmlElement(name = "CreDtTm", required = true)
	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
}