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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.SettlementUnitType2Choice;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Settlement of the securities in a securities transaction, that is, the
 * instruction to deliver or receive securities, involving the payment of an
 * amount of money or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmSecuritiesQuantityType
 * SettlementInformation4.mmSecuritiesQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmContractSettlementMonth
 * SettlementInformation4.mmContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmMinimumDenomination
 * SettlementInformation4.mmMinimumDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmMinimumMultipleQuantity
 * SettlementInformation4.mmMinimumMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmDeviatingSettlementUnit
 * SettlementInformation4.mmDeviatingSettlementUnit}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not."
 * </li>
 * </ul>
 */
public class SettlementInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SettlementUnitType2Choice securitiesQuantityType;
	/**
	 * Choice between formats for the quantity of security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementUnitType2Choice
	 * SettlementUnitType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice between formats for the quantity of security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesQuantityType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityType";
			definition = "Choice between formats for the quantity of security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementUnitType2Choice.mmObject();
		}
	};
	protected ISOYearMonth contractSettlementMonth;
	/**
	 * Specifies when the contract (i.e. MBS/TBA) will settle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSttlmMnth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSettlementMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies when the contract (i.e. MBS/TBA) will settle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractSettlementMonth = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "CtrctSttlmMnth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice minimumDenomination;
	/**
	 * Indicates the minimum quantity (unit or nominal) of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinDnmtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the minimum quantity (unit or nominal) of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumDenomination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "MinDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum quantity (unit or nominal) of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice minimumMultipleQuantity;
	/**
	 * Minimum multiple quantity (unit or nominal) of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMltplQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity (unit or nominal) of securities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumMultipleQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "MinMltplQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMultipleQuantity";
			definition = "Minimum multiple quantity (unit or nominal) of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected List<FinancialInstrumentQuantity1Choice> deviatingSettlementUnit;
	/**
	 * Minimum quantity of securities that can be purchased without incurring a
	 * larger fee. For example, if the round lot size is 100 and the trade is
	 * for 125 shares, then 100 will be processed without a fee and the
	 * remaining 25 will incur a service fee for being an odd lot size.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DevtgSttlmUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeviatingSettlementUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeviatingSettlementUnit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "DevtgSttlmUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviatingSettlementUnit";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementInformation4.mmSecuritiesQuantityType, SettlementInformation4.mmContractSettlementMonth, SettlementInformation4.mmMinimumDenomination,
						SettlementInformation4.mmMinimumMultipleQuantity, SettlementInformation4.mmDeviatingSettlementUnit);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementInformation4";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementUnitType2Choice getSecuritiesQuantityType() {
		return securitiesQuantityType;
	}

	public void setSecuritiesQuantityType(SettlementUnitType2Choice securitiesQuantityType) {
		this.securitiesQuantityType = securitiesQuantityType;
	}

	public ISOYearMonth getContractSettlementMonth() {
		return contractSettlementMonth;
	}

	public void setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = contractSettlementMonth;
	}

	public FinancialInstrumentQuantity1Choice getMinimumDenomination() {
		return minimumDenomination;
	}

	public void setMinimumDenomination(FinancialInstrumentQuantity1Choice minimumDenomination) {
		this.minimumDenomination = minimumDenomination;
	}

	public FinancialInstrumentQuantity1Choice getMinimumMultipleQuantity() {
		return minimumMultipleQuantity;
	}

	public void setMinimumMultipleQuantity(FinancialInstrumentQuantity1Choice minimumMultipleQuantity) {
		this.minimumMultipleQuantity = minimumMultipleQuantity;
	}

	public List<FinancialInstrumentQuantity1Choice> getDeviatingSettlementUnit() {
		return deviatingSettlementUnit;
	}

	public void setDeviatingSettlementUnit(List<FinancialInstrumentQuantity1Choice> deviatingSettlementUnit) {
		this.deviatingSettlementUnit = deviatingSettlementUnit;
	}
}