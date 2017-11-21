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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a switch leg that is rejected or repaired.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmLegIdentificationRule
 * SwitchLegReferences1.mmLegIdentificationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmRedemptionLegIdentification
 * SwitchLegReferences1.mmRedemptionLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmSubscriptionLegIdentification
 * SwitchLegReferences1.mmSubscriptionLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmLegRejectionReason
 * SwitchLegReferences1.mmLegRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmRepairedConditions
 * SwitchLegReferences1.mmRepairedConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmInvestmentAccountDetails
 * SwitchLegReferences1.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmFinancialInstrumentDetails
 * SwitchLegReferences1.mmFinancialInstrumentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchLegReferences1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a switch leg that is rejected or repaired."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchLegReferences2
 * SwitchLegReferences2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SwitchLegReferences1", propOrder = {"redemptionLegIdentification", "subscriptionLegIdentification", "legRejectionReason", "repairedConditions", "investmentAccountDetails", "financialInstrumentDetails"})
public class SwitchLegReferences1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text redemptionLegIdentification;
	/**
	 * Unique technical identifier for an instance of a leg within a switch.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1
	 * SwitchLegReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for an instance of a leg within a switch."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> SwitchLegReferences1.mmObject();
			isDerived = false;
			xmlTag = "RedLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionLegIdentification";
			definition = "Unique technical identifier for an instance of a leg within a switch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text subscriptionLegIdentification;
	/**
	 * Unique technical identifier for an instance of a leg within a switch.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1
	 * SwitchLegReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for an instance of a leg within a switch."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> SwitchLegReferences1.mmObject();
			isDerived = false;
			xmlTag = "SbcptLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionLegIdentification";
			definition = "Unique technical identifier for an instance of a leg within a switch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max350Text legRejectionReason;
	/**
	 * Additional information about the reason for the rejection of a leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1
	 * SwitchLegReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegRjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the reason for the rejection of a leg."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmLegRejectionReason
	 * SwitchLegReferences2.mmLegRejectionReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegRejectionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> SwitchLegReferences1.mmObject();
			isDerived = false;
			xmlTag = "LegRjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegRejectionReason";
			definition = "Additional information about the reason for the rejection of a leg.";
			nextVersions_lazy = () -> Arrays.asList(SwitchLegReferences2.mmLegRejectionReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected RepairedConditions3 repairedConditions;
	/**
	 * Elements from the original switch order that have been repaired so that
	 * the switch order can be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RepairedConditions3
	 * RepairedConditions3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
	 * InvestmentFundOrder.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1
	 * SwitchLegReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements from the original switch order that have been repaired so that the switch order can be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepairedConditions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderStatus;
			componentContext_lazy = () -> SwitchLegReferences1.mmObject();
			isDerived = false;
			xmlTag = "RprdConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedConditions";
			definition = "Elements from the original switch order that have been repaired so that the switch order can be accepted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RepairedConditions3.mmObject();
		}
	};
	protected InvestmentAccount13 investmentAccountDetails;
	/**
	 * Account identification of the switch leg that is rejected or repaired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount13
	 * InvestmentAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1
	 * SwitchLegReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account identification of the switch leg that is rejected or repaired."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmInvestmentAccountDetails
	 * SwitchLegReferences2.mmInvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> SwitchLegReferences1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account identification of the switch leg that is rejected or repaired.";
			nextVersions_lazy = () -> Arrays.asList(SwitchLegReferences2.mmInvestmentAccountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount13.mmObject();
		}
	};
	protected FinancialInstrument10 financialInstrumentDetails;
	/**
	 * Financial instrument identification of the switch leg that is rejected or
	 * repaired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1
	 * SwitchLegReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument identification of the switch leg that is rejected or repaired."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmFinancialInstrumentDetails
	 * SwitchLegReferences2.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> SwitchLegReferences1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument identification of the switch leg that is rejected or repaired.";
			nextVersions_lazy = () -> Arrays.asList(SwitchLegReferences2.mmFinancialInstrumentDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument10.mmObject();
		}
	};
	/**
	 * Either RedemptionLegIdentification or SubscriptionLegIdentification must
	 * be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1
	 * SwitchLegReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmRedemptionLegIdentification
	 * SwitchLegReferences1.mmRedemptionLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmSubscriptionLegIdentification
	 * SwitchLegReferences1.mmSubscriptionLegIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RedemptionLegIdentification or SubscriptionLegIdentification must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmLegIdentificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentificationRule";
			definition = "Either RedemptionLegIdentification or SubscriptionLegIdentification must be present, but not both.";
			messageComponent_lazy = () -> SwitchLegReferences1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(SwitchLegReferences1.mmRedemptionLegIdentification, SwitchLegReferences1.mmSubscriptionLegIdentification);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SwitchLegReferences1.mmRedemptionLegIdentification, SwitchLegReferences1.mmSubscriptionLegIdentification, SwitchLegReferences1.mmLegRejectionReason,
						SwitchLegReferences1.mmRepairedConditions, SwitchLegReferences1.mmInvestmentAccountDetails, SwitchLegReferences1.mmFinancialInstrumentDetails);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SwitchLegReferences1";
				definition = "Information about a switch leg that is rejected or repaired.";
				nextVersions_lazy = () -> Arrays.asList(SwitchLegReferences2.mmObject());
				xors_lazy = () -> Arrays.asList(SwitchLegReferences1.mmLegIdentificationRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RedLegId", required = true)
	public Max35Text getRedemptionLegIdentification() {
		return redemptionLegIdentification;
	}

	public void setRedemptionLegIdentification(Max35Text redemptionLegIdentification) {
		this.redemptionLegIdentification = redemptionLegIdentification;
	}

	@XmlElement(name = "SbcptLegId", required = true)
	public Max35Text getSubscriptionLegIdentification() {
		return subscriptionLegIdentification;
	}

	public void setSubscriptionLegIdentification(Max35Text subscriptionLegIdentification) {
		this.subscriptionLegIdentification = subscriptionLegIdentification;
	}

	@XmlElement(name = "LegRjctnRsn")
	public Max350Text getLegRejectionReason() {
		return legRejectionReason;
	}

	public void setLegRejectionReason(Max350Text legRejectionReason) {
		this.legRejectionReason = legRejectionReason;
	}

	@XmlElement(name = "RprdConds")
	public RepairedConditions3 getRepairedConditions() {
		return repairedConditions;
	}

	public void setRepairedConditions(com.tools20022.repository.msg.RepairedConditions3 repairedConditions) {
		this.repairedConditions = repairedConditions;
	}

	@XmlElement(name = "InvstmtAcctDtls")
	public InvestmentAccount13 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public void setInvestmentAccountDetails(com.tools20022.repository.msg.InvestmentAccount13 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
	}

	@XmlElement(name = "FinInstrmDtls")
	public FinancialInstrument10 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument10 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}
}