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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#mmInstrument
 * UnitsAndCash.mmInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGrandTotalAmount
 * UnitsAndCash.mmGrandTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGroup1Number
 * UnitsAndCash.mmGroup1Number}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGroup2Number
 * UnitsAndCash.mmGroup2Number}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmCompleteIndicator
 * UnitsAndCash.mmCompleteIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitsAndCash"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UnitsAndCash", propOrder = {"instrument", "grandTotalAmount", "group1Number", "group2Number", "completeIndicator"})
public class UnitsAndCash {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrument7 instrument;
	/**
	 * Specifies the type of underlying assets for the PEP or ISA.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of underlying assets for the PEP or ISA."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "Instrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instrument";
			definition = "Specifies the type of underlying assets for the PEP or ISA.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument7.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount grandTotalAmount;
	/**
	 * Quantity expressed as an amount, eg, in the investment fund business, a
	 * quantity of a financial instrument may be expressed as an amount of
	 * money.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
	 * SecuritiesQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrdTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrandTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrandTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "GrdTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrandTotalAmount";
			definition = "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected DecimalNumber group1Number;
	/**
	 * Quantity expressed as a number, eg, a number of shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp1Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity expressed as a number, eg, a number of shares."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroup1Number = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "Grp1Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1Number";
			definition = "Quantity expressed as a number, eg, a number of shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber group2Number;
	/**
	 * Quantity expressed as a number, eg, a number of shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp2Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group2Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity expressed as a number, eg, a number of shares."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroup2Number = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "Grp2Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group2Number";
			definition = "Quantity expressed as a number, eg, a number of shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected YesNoIndicator completeIndicator;
	/**
	 * Specifies whether the transfer of the asset is final or not, eg whether
	 * dividends or units are still to be delivered.
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
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transfer of the asset is final or not, eg whether dividends or units are still to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompleteIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "CmpltInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteIndicator";
			definition = "Specifies whether the transfer of the asset is final or not, eg whether dividends or units are still to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnitsAndCash.mmInstrument, UnitsAndCash.mmGrandTotalAmount, UnitsAndCash.mmGroup1Number, UnitsAndCash.mmGroup2Number, UnitsAndCash.mmCompleteIndicator);
				trace_lazy = () -> InvestmentFundOrderExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnitsAndCash";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Instrm", required = true)
	public FinancialInstrument7 getInstrument() {
		return instrument;
	}

	public void setInstrument(com.tools20022.repository.msg.FinancialInstrument7 instrument) {
		this.instrument = instrument;
	}

	@XmlElement(name = "GrdTtlAmt", required = true)
	public ImpliedCurrencyAndAmount getGrandTotalAmount() {
		return grandTotalAmount;
	}

	public void setGrandTotalAmount(ImpliedCurrencyAndAmount grandTotalAmount) {
		this.grandTotalAmount = grandTotalAmount;
	}

	@XmlElement(name = "Grp1Nb")
	public DecimalNumber getGroup1Number() {
		return group1Number;
	}

	public void setGroup1Number(DecimalNumber group1Number) {
		this.group1Number = group1Number;
	}

	@XmlElement(name = "Grp2Nb")
	public DecimalNumber getGroup2Number() {
		return group2Number;
	}

	public void setGroup2Number(DecimalNumber group2Number) {
		this.group2Number = group2Number;
	}

	@XmlElement(name = "CmpltInd")
	public YesNoIndicator getCompleteIndicator() {
		return completeIndicator;
	}

	public void setCompleteIndicator(YesNoIndicator completeIndicator) {
		this.completeIndicator = completeIndicator;
	}
}