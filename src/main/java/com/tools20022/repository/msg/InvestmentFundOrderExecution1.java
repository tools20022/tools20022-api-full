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
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference of an order, deal reference, client reference and master reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#mmMasterReference
 * InvestmentFundOrderExecution1.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#mmAmendmentIndicator
 * InvestmentFundOrderExecution1.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#mmOrderReferences
 * InvestmentFundOrderExecution1.mmOrderReferences}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * RedemptionOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByReference}</li>
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
 * "InvestmentFundOrderExecution1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference of an order, deal reference, client reference and master reference."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvestmentFundOrderExecution1", propOrder = {"masterReference", "amendmentIndicator", "orderReferences"})
public class InvestmentFundOrderExecution1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text masterReference;
	/**
	 * Unique and unambiguous identifier for a group of individual orders, as
	 * assigned by the instructing party. This identifier links the individual
	 * orders together.
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> InvestmentFundOrderExecution1.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator amendmentIndicator;
	/**
	 * Indicates whether a confirmation amendment message will follow the
	 * confirmation cancellation instruction or not.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmendmentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentFundOrderExecution1.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentFundOrderExecution2> orderReferences;
	/**
	 * Reference of an order, client or deal reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2
	 * InvestmentFundOrderExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRefs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of an order, client or deal reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderReferences = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> InvestmentFundOrderExecution1.mmObject();
			isDerived = false;
			xmlTag = "OrdrRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferences";
			definition = "Reference of an order, client or deal reference.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentFundOrderExecution2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentFundOrderExecution1.mmMasterReference, InvestmentFundOrderExecution1.mmAmendmentIndicator, InvestmentFundOrderExecution1.mmOrderReferences);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByReference, RedemptionOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
						SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByReference, SubscriptionOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
						SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByReference);
				trace_lazy = () -> InvestmentFundOrderExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrderExecution1";
				definition = "Reference of an order, deal reference, client reference and master reference.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MstrRef")
	public Max35Text getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
	}

	@XmlElement(name = "AmdmntInd", required = true)
	public YesNoIndicator getAmendmentIndicator() {
		return amendmentIndicator;
	}

	public void setAmendmentIndicator(YesNoIndicator amendmentIndicator) {
		this.amendmentIndicator = amendmentIndicator;
	}

	@XmlElement(name = "OrdrRefs", required = true)
	public List<InvestmentFundOrderExecution2> getOrderReferences() {
		return orderReferences;
	}

	public void setOrderReferences(List<com.tools20022.repository.msg.InvestmentFundOrderExecution2> orderReferences) {
		this.orderReferences = orderReferences;
	}
}