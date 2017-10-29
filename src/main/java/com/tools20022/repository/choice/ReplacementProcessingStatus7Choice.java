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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.ProprietaryReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of status for the replacement processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Accepted
 * ReplacementProcessingStatus7Choice.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Completed
 * ReplacementProcessingStatus7Choice.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Denied
 * ReplacementProcessingStatus7Choice.Denied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#InRepair
 * ReplacementProcessingStatus7Choice.InRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#PartialReplacementAccepted
 * ReplacementProcessingStatus7Choice.PartialReplacementAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Pending
 * ReplacementProcessingStatus7Choice.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#ReceivedAtIntermediary
 * ReplacementProcessingStatus7Choice.ReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#ReceivedAtStockExchange
 * ReplacementProcessingStatus7Choice.ReceivedAtStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#Rejected
 * ReplacementProcessingStatus7Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#ModificationRequested
 * ReplacementProcessingStatus7Choice.ModificationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#ProprietaryStatus
 * ReplacementProcessingStatus7Choice.ProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#ReplacementProcessingStatus
 * SecuritiesTradeConfirmationStatusAdviceV01.ReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#ReplacementProcessingStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.ReplacementProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReplacementProcessingStatus7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status for the replacement processing."</li>
 * </ul>
 */
public class ReplacementProcessingStatus7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Replacement of the trade is accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is accepted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Accepted = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "Accptd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Replacement of the trade is accepted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmpltd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is completed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Completed = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "Cmpltd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			definition = "Replacement of the trade is completed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is denied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is denied."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Denied = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "Dnd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Replacement of the trade is denied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is In repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InRpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is In repair."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd InRepair = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "InRpr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Replacement of the trade is In repair.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is PartialReplacementAccepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlRplcmntAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialReplacementAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is PartialReplacementAccepted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PartialReplacementAccepted = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "PrtlRplcmntAccptd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialReplacementAccepted";
			definition = "Replacement of the trade is PartialReplacementAccepted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is pending."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Pending = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Replacement of the trade is pending.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is ReceivedAtIntermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdAtIntrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is ReceivedAtIntermediary."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReceivedAtIntermediary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "RcvdAtIntrmy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Replacement of the trade is ReceivedAtIntermediary.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is ReceivedAtStockExchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdAtStockXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is ReceivedAtStockExchange."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ReceivedAtStockExchange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "RcvdAtStockXchg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			definition = "Replacement of the trade is ReceivedAtStockExchange.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Rejected = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Replacement of the trade is rejected.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryReason1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Replacement of the trade is Modification Requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModReqd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of the trade is Modification Requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ModificationRequested = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "ModReqd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			definition = "Replacement of the trade is Modification Requested.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> ProprietaryReason1.mmObject();
		}
	};
	/**
	 * Provides a proprietary status and a proprietary reason of the processing
	 * status of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#TransactionProcessingStatus
	 * Status.TransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a proprietary status and a proprietary reason of the processing status of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProprietaryStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.TransactionProcessingStatus;
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Provides a proprietary status and a proprietary reason of the processing status of the trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Accepted, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Completed,
						com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Denied, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.InRepair,
						com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.PartialReplacementAccepted, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Pending,
						com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.ReceivedAtIntermediary, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.ReceivedAtStockExchange,
						com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.Rejected, com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.ModificationRequested,
						com.tools20022.repository.choice.ReplacementProcessingStatus7Choice.ProprietaryStatus);
				trace_lazy = () -> Status.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01.ReplacementProcessingStatus,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.ReplacementProcessingStatus);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReplacementProcessingStatus7Choice";
				definition = "Choice of status for the replacement processing.";
			}
		});
		return mmObject_lazy.get();
	}
}