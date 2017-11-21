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
import com.tools20022.repository.area.secl.MarginReportV02;
import com.tools20022.repository.choice.MarginResult1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the total margin amount, the collateral amount on deposit and the
 * total minimum requirement that used to calculate the margin result, either an
 * excess or a deficit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#mmTotalMarginAmount
 * MarginCalculation1.mmTotalMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#mmCollateralOnDeposit
 * MarginCalculation1.mmCollateralOnDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#mmMinimumRequirementDeposit
 * MarginCalculation1.mmMinimumRequirementDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#mmMarginResult
 * MarginCalculation1.mmMarginResult}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmReportSummary
 * MarginReportV02.mmReportSummary}</li>
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
 * "MarginCalculation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the total margin amount, the collateral amount on deposit and the total minimum requirement that used to calculate the margin result, either an excess or a deficit."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginCalculation1", propOrder = {"totalMarginAmount", "collateralOnDeposit", "minimumRequirementDeposit", "marginResult"})
public class MarginCalculation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection20 totalMarginAmount;
	/**
	 * Total margin requirement (expressed in the reporting currency) that must
	 * be provided by the clearing member to the central counterparty. This is
	 * the total requirement calculated to cover the initial margin and the
	 * variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection20
	 * AmountAndDirection20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmTotalMarginAmount
	 * MarginCall.mmTotalMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1
	 * MarginCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlMrgnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total margin requirement (expressed in the reporting currency) that must be provided by the clearing member to the central counterparty. This is the total requirement calculated to cover the initial margin and the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalMarginAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmTotalMarginAmount;
			componentContext_lazy = () -> MarginCalculation1.mmObject();
			isDerived = false;
			xmlTag = "TtlMrgnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarginAmount";
			definition = "Total margin requirement (expressed in the reporting currency) that must be provided by the clearing member to the central counterparty. This is the total requirement calculated to cover the initial margin and the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection20.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Collateral6> collateralOnDeposit;
	/**
	 * Provides details on the valuation of the collateral on deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral6
	 * Collateral6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
	 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1
	 * MarginCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOnDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOnDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the valuation of the collateral on deposit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralOnDeposit = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> MarginCalculation1.mmObject();
			isDerived = false;
			xmlTag = "CollOnDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOnDeposit";
			definition = "Provides details on the valuation of the collateral on deposit.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Collateral6.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount minimumRequirementDeposit;
	/**
	 * Minimum requirement (expressed in the reporting currency) for a
	 * participant if their requirement falls below a specific amount set by the
	 * central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumRequirementDeposit
	 * ExposureTerm.mmMinimumRequirementDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1
	 * MarginCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinRqrmntDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRequirementDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum requirement (expressed in the reporting currency) for a participant if their requirement falls below a specific amount set by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumRequirementDeposit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmMinimumRequirementDeposit;
			componentContext_lazy = () -> MarginCalculation1.mmObject();
			isDerived = false;
			xmlTag = "MinRqrmntDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumRequirementDeposit";
			definition = "Minimum requirement (expressed in the reporting currency) for a participant if their requirement falls below a specific amount set by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected MarginResult1Choice marginResult;
	/**
	 * Provide details on the margin result taking into consideration the total
	 * margin amount and the minimum requirements deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.MarginResult1Choice
	 * MarginResult1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralMovement
	 * MarginCall.mmCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1
	 * MarginCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide details on the margin result taking into consideration the total margin amount and the minimum requirements deposit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmCollateralMovement;
			componentContext_lazy = () -> MarginCalculation1.mmObject();
			isDerived = false;
			xmlTag = "MrgnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginResult";
			definition = "Provide details on the margin result taking into consideration the total margin amount and the minimum requirements deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginResult1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarginCalculation1.mmTotalMarginAmount, MarginCalculation1.mmCollateralOnDeposit, MarginCalculation1.mmMinimumRequirementDeposit, MarginCalculation1.mmMarginResult);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginReportV02.mmReportSummary);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCalculation1";
				definition = "Provides the total margin amount, the collateral amount on deposit and the total minimum requirement that used to calculate the margin result, either an excess or a deficit.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlMrgnAmt", required = true)
	public AmountAndDirection20 getTotalMarginAmount() {
		return totalMarginAmount;
	}

	public void setTotalMarginAmount(com.tools20022.repository.msg.AmountAndDirection20 totalMarginAmount) {
		this.totalMarginAmount = totalMarginAmount;
	}

	@XmlElement(name = "CollOnDpst")
	public List<Collateral6> getCollateralOnDeposit() {
		return collateralOnDeposit;
	}

	public void setCollateralOnDeposit(List<com.tools20022.repository.msg.Collateral6> collateralOnDeposit) {
		this.collateralOnDeposit = collateralOnDeposit;
	}

	@XmlElement(name = "MinRqrmntDpst")
	public ActiveCurrencyAndAmount getMinimumRequirementDeposit() {
		return minimumRequirementDeposit;
	}

	public void setMinimumRequirementDeposit(ActiveCurrencyAndAmount minimumRequirementDeposit) {
		this.minimumRequirementDeposit = minimumRequirementDeposit;
	}

	@XmlElement(name = "MrgnRslt")
	public MarginResult1Choice getMarginResult() {
		return marginResult;
	}

	public void setMarginResult(MarginResult1Choice marginResult) {
		this.marginResult = marginResult;
	}
}