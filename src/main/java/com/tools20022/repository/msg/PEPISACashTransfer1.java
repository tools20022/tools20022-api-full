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
import com.tools20022.repository.choice.PEPOrISAChoice;
import com.tools20022.repository.codeset.PEPISA1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the type of account and the assets to be transferred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#PercentageOrAmountOrYearRule
 * PEPISACashTransfer1.PercentageOrAmountOrYearRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmIdentification
 * PEPISACashTransfer1.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmType
 * PEPISACashTransfer1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmPercentageToBeTransferred
 * PEPISACashTransfer1.mmPercentageToBeTransferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmAmountToBeTransferred
 * PEPISACashTransfer1.mmAmountToBeTransferred}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmYear
 * PEPISACashTransfer1.mmYear}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmAssets
 * PEPISACashTransfer1.mmAssets}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPEPOrISARule#forPEPISACashTransfer1
 * ConstraintPEPOrISARule.forPEPISACashTransfer1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PEPISACashTransfer1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of account and the assets to be transferred."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PEPISACashTransfer1", propOrder = {"identification", "type", "percentageToBeTransferred", "amountToBeTransferred", "year", "assets"})
public class PEPISACashTransfer1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
	 * PEPISACashTransfer1}</li>
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
	 * definition} =
	 * "Identification assigned by the new plan manager to each transfer of asset. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the new plan manager to each transfer of asset. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected PEPISA1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PEPISA1Code
	 * PEPISA1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPEPOrISAPlan
	 * PortfolioTransfer.mmPEPOrISAPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
	 * PEPISACashTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of product that will be transferred. PEP or ISA. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmPEPOrISAPlan;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the type of product that will be transferred. PEP or ISA. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PEPISA1Code.mmObject();
		}
	};
	@XmlElement(name = "PctgToBeTrfd", required = true)
	protected PercentageRate percentageToBeTransferred;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPercentage
	 * PortfolioTransfer.mmTransferredPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
	 * PEPISACashTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgToBeTrfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageToBeTransferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageToBeTransferred = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer1.mmObject();
			isDerived = false;
			xmlTag = "PctgToBeTrfd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageToBeTransferred";
			definition = "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "AmtToBeTrfd", required = true)
	protected ImpliedCurrencyAndAmount amountToBeTransferred;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
	 * PEPISACashTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToBeTrfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToBeTransferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountToBeTransferred = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer1.mmObject();
			isDerived = false;
			xmlTag = "AmtToBeTrfd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToBeTransferred";
			definition = "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "Yr", required = true)
	protected PEPOrISAChoice year;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PEPOrISAChoice
	 * PEPOrISAChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredYear
	 * PortfolioTransfer.mmTransferredYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
	 * PEPISACashTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Yr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the year during which the investment plan was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmYear = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredYear;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer1.mmObject();
			isDerived = false;
			xmlTag = "Yr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Year";
			definition = "Specifies the year during which the investment plan was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PEPOrISAChoice.mmObject();
		}
	};
	@XmlElement(name = "Assts")
	protected List<com.tools20022.repository.msg.FinancialInstrument7> assets;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument7
	 * FinancialInstrument7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
	 * PEPISACashTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying assets for the PEP or ISA."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssets = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer1.mmObject();
			isDerived = false;
			xmlTag = "Assts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assets";
			definition = "Specifies the underlying assets for the PEP or ISA.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument7.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (PercentageToBeTransferred,
	 * AmountToBeTransferred, Year) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
	 * PEPISACashTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmPercentageToBeTransferred
	 * PEPISACashTransfer1.mmPercentageToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmAmountToBeTransferred
	 * PEPISACashTransfer1.mmAmountToBeTransferred}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmYear
	 * PEPISACashTransfer1.mmYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOrAmountOrYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (PercentageToBeTransferred, AmountToBeTransferred, Year) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor PercentageOrAmountOrYearRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOrAmountOrYearRule";
			definition = "One and only one message element in the list (PercentageToBeTransferred, AmountToBeTransferred, Year) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer1.mmPercentageToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer1.mmAmountToBeTransferred,
					com.tools20022.repository.msg.PEPISACashTransfer1.mmYear);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer1.mmIdentification, com.tools20022.repository.msg.PEPISACashTransfer1.mmType,
						com.tools20022.repository.msg.PEPISACashTransfer1.mmPercentageToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer1.mmAmountToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer1.mmYear,
						com.tools20022.repository.msg.PEPISACashTransfer1.mmAssets);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPEPOrISARule.forPEPISACashTransfer1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PEPISACashTransfer1";
				definition = "Describes the type of account and the assets to be transferred.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer1.PercentageOrAmountOrYearRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public PEPISACashTransfer1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public PEPISA1Code getType() {
		return type;
	}

	public PEPISACashTransfer1 setType(PEPISA1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PercentageRate getPercentageToBeTransferred() {
		return percentageToBeTransferred;
	}

	public PEPISACashTransfer1 setPercentageToBeTransferred(PercentageRate percentageToBeTransferred) {
		this.percentageToBeTransferred = Objects.requireNonNull(percentageToBeTransferred);
		return this;
	}

	public ImpliedCurrencyAndAmount getAmountToBeTransferred() {
		return amountToBeTransferred;
	}

	public PEPISACashTransfer1 setAmountToBeTransferred(ImpliedCurrencyAndAmount amountToBeTransferred) {
		this.amountToBeTransferred = Objects.requireNonNull(amountToBeTransferred);
		return this;
	}

	public PEPOrISAChoice getYear() {
		return year;
	}

	public PEPISACashTransfer1 setYear(PEPOrISAChoice year) {
		this.year = Objects.requireNonNull(year);
		return this;
	}

	public List<FinancialInstrument7> getAssets() {
		return assets == null ? assets = new ArrayList<>() : assets;
	}

	public PEPISACashTransfer1 setAssets(List<com.tools20022.repository.msg.FinancialInstrument7> assets) {
		this.assets = Objects.requireNonNull(assets);
		return this;
	}
}