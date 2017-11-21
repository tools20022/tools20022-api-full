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
import com.tools20022.repository.choice.CommodityDerivate2Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transparency calculation specific details for an commodity derivatives.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4#mmClassSpecific
 * CommodityDerivate4.mmClassSpecific}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4#mmNotionalCurrency
 * CommodityDerivate4.mmNotionalCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "CommodityDerivate4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transparency calculation specific details for an commodity derivatives."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CommodityDerivate4", propOrder = {"classSpecific", "notionalCurrency"})
public class CommodityDerivate4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CommodityDerivate2Choice classSpecific;
	/**
	 * Provides specific information related to commodity derivatives.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CommodityDerivate2Choice
	 * CommodityDerivate2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4
	 * CommodityDerivate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssSpcfc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassSpecific"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides specific information related to commodity derivatives."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClassSpecific = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commodity.mmObject();
			componentContext_lazy = () -> CommodityDerivate4.mmObject();
			isDerived = false;
			xmlTag = "ClssSpcfc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassSpecific";
			definition = "Provides specific information related to commodity derivatives.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommodityDerivate2Choice.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode notionalCurrency;
	/**
	 * Currency in which the notional is denominated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrency
	 * Derivative.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4
	 * CommodityDerivate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the notional is denominated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotionalCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrency;
			componentContext_lazy = () -> CommodityDerivate4.mmObject();
			isDerived = false;
			xmlTag = "NtnlCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency in which the notional is denominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CommodityDerivate4.mmClassSpecific, CommodityDerivate4.mmNotionalCurrency);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommodityDerivate4";
				definition = "Transparency calculation specific details for an commodity derivatives.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ClssSpcfc")
	public CommodityDerivate2Choice getClassSpecific() {
		return classSpecific;
	}

	public void setClassSpecific(CommodityDerivate2Choice classSpecific) {
		this.classSpecific = classSpecific;
	}

	@XmlElement(name = "NtnlCcy", required = true)
	public ActiveOrHistoricCurrencyCode getNotionalCurrency() {
		return notionalCurrency;
	}

	public void setNotionalCurrency(ActiveOrHistoricCurrencyCode notionalCurrency) {
		this.notionalCurrency = notionalCurrency;
	}
}