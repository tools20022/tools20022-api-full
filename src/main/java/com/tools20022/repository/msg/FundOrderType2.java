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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.FundOrderType4Choice;
import com.tools20022.repository.codeset.FundOrderType3Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.InvestmentFundOrder;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Specifies the category of the investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderType2#OrderTypeOrExtendedOrderTypeRule
 * FundOrderType2.OrderTypeOrExtendedOrderTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType2#OrderType
 * FundOrderType2.OrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderType2#ExtendedOrderType
 * FundOrderType2.ExtendedOrderType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundOrderType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of the investment fund order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.FundOrderType4Choice
 * FundOrderType4Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class FundOrderType2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the category of the investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType3Code
	 * FundOrderType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderType
	 * InvestmentFundOrder.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderType2 FundOrderType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice#Code
	 * FundOrderType4Choice.Code}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute OrderType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundOrderType2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.OrderType;
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FundOrderType4Choice.Code);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FundOrderType3Code.mmObject();
		}
	};
	/**
	 * Specifies the category of the investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderType
	 * InvestmentFundOrder.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderType2 FundOrderType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedOrdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedOrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice#Proprietary
	 * FundOrderType4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExtendedOrderType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundOrderType2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.OrderType;
			isDerived = false;
			xmlTag = "XtndedOrdrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedOrderType";
			definition = "Specifies the category of the investment fund order.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FundOrderType4Choice.Proprietary);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	/**
	 * Either OrderType or ExtendedOrderType may be present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType2#OrderType
	 * FundOrderType2.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderType2#ExtendedOrderType
	 * FundOrderType2.ExtendedOrderType}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderType2 FundOrderType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderTypeOrExtendedOrderTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OrderType or ExtendedOrderType may be present but not both."</li>
	 * </ul>
	 */
	public static final MMXor OrderTypeOrExtendedOrderTypeRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderTypeOrExtendedOrderTypeRule";
			definition = "Either OrderType or ExtendedOrderType may be present but not both.";
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderType2.OrderType, com.tools20022.repository.msg.FundOrderType2.ExtendedOrderType);
			messageComponent_lazy = () -> FundOrderType2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderType2.OrderType, com.tools20022.repository.msg.FundOrderType2.ExtendedOrderType);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FundOrderType2";
				definition = "Specifies the category of the investment fund order.";
				nextVersions_lazy = () -> Arrays.asList(FundOrderType4Choice.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderType2.OrderTypeOrExtendedOrderTypeRule);
			}
		});
		return mmObject_lazy.get();
	}
}