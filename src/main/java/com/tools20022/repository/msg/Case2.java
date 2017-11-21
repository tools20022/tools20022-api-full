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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Set of elements used to identify a case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Case2#mmIdentification
 * Case2.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Case2#mmCreator
 * Case2.mmCreator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Case2#mmReopenCaseIndication
 * Case2.mmReopenCaseIndication}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV01#mmCase
 * CustomerPaymentCancellationRequestV01.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV01#mmCase
 * FIToFIPaymentCancellationRequestV01.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmCase
 * RequestToModifyPaymentV03.mmCase}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV03#mmCase
 * UnableToApplyV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03#mmCase
 * ClaimNonReceiptV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV03#mmCase
 * AdditionalPaymentInformationV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmResolvedCase
 * ResolutionOfInvestigationV03.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03#mmCase
 * NotificationOfCaseAssignmentV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV03#mmCase
 * RejectInvestigationV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV02#mmCase
 * CancelCaseAssignmentV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV03#mmCase
 * RequestForDuplicateV03.mmCase}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DuplicateV03#mmCase
 * DuplicateV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02#mmCase
 * ProprietaryFormatInvestigationV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV02#mmCase
 * DebitAuthorisationResponseV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03#mmCase
 * DebitAuthorisationRequestV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV02#mmCase
 * CaseStatusReportRequestV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV03#mmCase
 * CaseStatusReportV03.mmCase}</li>
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
 * "Case2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements used to identify a case."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Case2", propOrder = {"identification", "creator", "reopenCaseIndication"})
public class Case2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Uniquely identifies the case.
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
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmIdentification
	 * InvestigationCase.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case2
	 * Case2}</li>
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
	 * definition} = "Uniquely identifies the case."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestigationCase.mmIdentification;
			componentContext_lazy = () -> Case2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Party7Choice creator;
	/**
	 * Party that created the investigation case.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case2
	 * Case2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cretr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that created the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Case2.mmObject();
			isDerived = false;
			xmlTag = "Cretr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creator";
			definition = "Party that created the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party7Choice.mmObject();
		}
	};
	protected YesNoIndicator reopenCaseIndication;
	/**
	 * Indicates whether or not the case was previously closed and is now
	 * re-opened.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case2
	 * Case2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReopCaseIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReopenCaseIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the case was previously closed and is now re-opened."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReopenCaseIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Case2.mmObject();
			isDerived = false;
			xmlTag = "ReopCaseIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReopenCaseIndication";
			definition = "Indicates whether or not the case was previously closed and is now re-opened.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Case2.mmIdentification, Case2.mmCreator, Case2.mmReopenCaseIndication);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentCancellationRequestV01.mmCase, FIToFIPaymentCancellationRequestV01.mmCase, RequestToModifyPaymentV03.mmCase, UnableToApplyV03.mmCase, ClaimNonReceiptV03.mmCase,
						AdditionalPaymentInformationV03.mmCase, ResolutionOfInvestigationV03.mmResolvedCase, NotificationOfCaseAssignmentV03.mmCase, RejectInvestigationV03.mmCase, CancelCaseAssignmentV02.mmCase,
						RequestForDuplicateV03.mmCase, DuplicateV03.mmCase, ProprietaryFormatInvestigationV02.mmCase, DebitAuthorisationResponseV02.mmCase, DebitAuthorisationRequestV03.mmCase, CaseStatusReportRequestV02.mmCase,
						CaseStatusReportV03.mmCase);
				trace_lazy = () -> InvestigationCase.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Case2";
				definition = "Set of elements used to identify a case.";
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

	@XmlElement(name = "Cretr", required = true)
	public Party7Choice getCreator() {
		return creator;
	}

	public void setCreator(Party7Choice creator) {
		this.creator = creator;
	}

	@XmlElement(name = "ReopCaseIndctn")
	public YesNoIndicator getReopenCaseIndication() {
		return reopenCaseIndication;
	}

	public void setReopenCaseIndication(YesNoIndicator reopenCaseIndication) {
		this.reopenCaseIndication = reopenCaseIndication;
	}
}