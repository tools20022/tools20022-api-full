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
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a securities entry is made. It holds information
 * such as opening and closing date and whether it can hold negative positions.
 * Definition of the entity includes the default setting for holding of
 * settlement instructions involving positions related to the account. Set of
 * MarketSpecificAttributes define specific properties for the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2#mmClosingDate
 * SystemSecuritiesAccount2.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2#mmHoldIndicator
 * SystemSecuritiesAccount2.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2#mmNegativePosition
 * SystemSecuritiesAccount2.mmNegativePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2#mmEndInvestorFlag
 * SystemSecuritiesAccount2.mmEndInvestorFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2#mmPricingScheme
 * SystemSecuritiesAccount2.mmPricingScheme}</li>
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
 * "SystemSecuritiesAccount2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account to or from which a securities entry is made.\nIt holds information such as opening and closing date and whether it can hold negative positions.\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\nSet of MarketSpecificAttributes define specific properties for the account."
 * </li>
 * </ul>
 */
public class SystemSecuritiesAccount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate closingDate;
	/**
	 * Legal closing date for the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2
	 * SystemSecuritiesAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal closing date for the securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount2.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Legal closing date for the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected TrueFalseIndicator holdIndicator;
	/**
	 * Meaning when true : Account is in Hold status.<br>
	 * Meaning when false : Account is in Release status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2
	 * SystemSecuritiesAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meaning when true : Account is in Hold status.\r\nMeaning when false : Account is in Release status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount2.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Meaning when true : Account is in Hold status.\r\nMeaning when false : Account is in Release status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected YesNoIndicator negativePosition;
	/**
	 * Specifies whether the securities account can hold a negative position in
	 * a security.
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
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2
	 * SystemSecuritiesAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NegPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegativePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the securities account can hold a negative position in a security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNegativePosition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount2.mmObject();
			isDerived = false;
			xmlTag = "NegPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegativePosition";
			definition = "Specifies whether the securities account can hold a negative position in a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Exact4AlphaNumericText endInvestorFlag;
	/**
	 * Specifies information to identify securities accounts where allocation
	 * instructions are posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2
	 * SystemSecuritiesAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndInvstrFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndInvestorFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information to identify securities accounts where allocation instructions are posted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndInvestorFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount2.mmObject();
			isDerived = false;
			xmlTag = "EndInvstrFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndInvestorFlag";
			definition = "Specifies information to identify securities accounts where allocation instructions are posted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};
	protected Exact4AlphaNumericText pricingScheme;
	/**
	 * Defines how the price is applied to the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemSecuritiesAccount2
	 * SystemSecuritiesAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricgSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines how the price is applied to the securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPricingScheme = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemSecuritiesAccount2.mmObject();
			isDerived = false;
			xmlTag = "PricgSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingScheme";
			definition = "Defines how the price is applied to the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SystemSecuritiesAccount2.mmClosingDate, SystemSecuritiesAccount2.mmHoldIndicator, SystemSecuritiesAccount2.mmNegativePosition, SystemSecuritiesAccount2.mmEndInvestorFlag,
						SystemSecuritiesAccount2.mmPricingScheme);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemSecuritiesAccount2";
				definition = "Account to or from which a securities entry is made.\nIt holds information such as opening and closing date and whether it can hold negative positions.\nDefinition of the entity includes the default setting for holding of settlement instructions involving positions related to the account.\nSet of MarketSpecificAttributes define specific properties for the account.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
	}

	public TrueFalseIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public void setHoldIndicator(TrueFalseIndicator holdIndicator) {
		this.holdIndicator = holdIndicator;
	}

	public YesNoIndicator getNegativePosition() {
		return negativePosition;
	}

	public void setNegativePosition(YesNoIndicator negativePosition) {
		this.negativePosition = negativePosition;
	}

	public Exact4AlphaNumericText getEndInvestorFlag() {
		return endInvestorFlag;
	}

	public void setEndInvestorFlag(Exact4AlphaNumericText endInvestorFlag) {
		this.endInvestorFlag = endInvestorFlag;
	}

	public Exact4AlphaNumericText getPricingScheme() {
		return pricingScheme;
	}

	public void setPricingScheme(Exact4AlphaNumericText pricingScheme) {
		this.pricingScheme = pricingScheme;
	}
}