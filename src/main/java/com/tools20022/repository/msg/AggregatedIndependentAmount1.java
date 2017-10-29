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
import com.tools20022.repository.entity.IndependentAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Independent amount could be defined at a trade level or portfolio level. It
 * is assumed that their treatment will be based on the exposure convention that
 * is whether netted together or treated on a gross basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1#Trade
 * AggregatedIndependentAmount1.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1#ValueAtRisk
 * AggregatedIndependentAmount1.ValueAtRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1#NetOpenPosition
 * AggregatedIndependentAmount1.NetOpenPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1#OtherAmount
 * AggregatedIndependentAmount1.OtherAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IndependentAmount
 * IndependentAmount}</li>
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
 * "AggregatedIndependentAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent amount could be defined at a trade level or portfolio level.  It is assumed that their treatment will be based on the exposure convention that is whether netted together or treated on a gross basis."
 * </li>
 * </ul>
 */
public class AggregatedIndependentAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total independent amount defined in the confirmations of individual
	 * trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount1
	 * IndependentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount#IndependentAmountPerTrade
	 * IndependentAmount.IndependentAmountPerTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1
	 * AggregatedIndependentAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total independent amount defined in the confirmations of individual trades."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Trade = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AggregatedIndependentAmount1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.IndependentAmount.IndependentAmountPerTrade;
			isDerived = false;
			xmlTag = "Trad";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Total independent amount defined in the confirmations of individual trades.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> IndependentAmount1.mmObject();
		}
	};
	/**
	 * Portfolio level independent amount that reflects portfolio change over a
	 * short time period using statistical techniques such as volatility and
	 * risk factor correlations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount1
	 * IndependentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount#IndependentAmountValueAtRisk
	 * IndependentAmount.IndependentAmountValueAtRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1
	 * AggregatedIndependentAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAtRsk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAtRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio level independent amount that reflects portfolio change over a short time period using statistical techniques such as volatility and risk factor correlations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ValueAtRisk = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AggregatedIndependentAmount1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.IndependentAmount.IndependentAmountValueAtRisk;
			isDerived = false;
			xmlTag = "ValAtRsk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAtRisk";
			definition = "Portfolio level independent amount that reflects portfolio change over a short time period using statistical techniques such as volatility and risk factor correlations.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> IndependentAmount1.mmObject();
		}
	};
	/**
	 * Portfolio level independent amount related to parties net open position.
	 * Net open position means the total of the net long FX and the net options
	 * in respect of each currency where: net long FX for any currency shall be
	 * the net amount (if any) of that currency which the party “A” is long as
	 * against party “B” in respect of all FX transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount1
	 * IndependentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount#IndependentAmountNetOpenPosition
	 * IndependentAmount.IndependentAmountNetOpenPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1
	 * AggregatedIndependentAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetOpnPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetOpenPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio level independent amount related to parties net open position. Net open position means the total of the net long FX and the net options in respect of each currency where: net long FX for any currency shall be the net amount (if any) of that currency which the party “A” is long as against party “B” in respect of all FX transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute NetOpenPosition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AggregatedIndependentAmount1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.IndependentAmount.IndependentAmountNetOpenPosition;
			isDerived = false;
			xmlTag = "NetOpnPos";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetOpenPosition";
			definition = "Portfolio level independent amount related to parties net open position. Net open position means the total of the net long FX and the net options in respect of each currency where: net long FX for any currency shall be the net amount (if any) of that currency which the party “A” is long as against party “B” in respect of all FX transactions.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> IndependentAmount1.mmObject();
		}
	};
	/**
	 * Any other amount that should be considered to calculate the independent
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndependentAmount2
	 * IndependentAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount
	 * IndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1
	 * AggregatedIndependentAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any other amount that should be considered to calculate the independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute OtherAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AggregatedIndependentAmount1.mmObject();
			businessComponentTrace_lazy = () -> IndependentAmount.mmObject();
			isDerived = false;
			xmlTag = "OthrAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmount";
			definition = "Any other amount that should be considered to calculate the independent amount.";
			minOccurs = 0;
			complexType_lazy = () -> IndependentAmount2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregatedIndependentAmount1.Trade, com.tools20022.repository.msg.AggregatedIndependentAmount1.ValueAtRisk,
						com.tools20022.repository.msg.AggregatedIndependentAmount1.NetOpenPosition, com.tools20022.repository.msg.AggregatedIndependentAmount1.OtherAmount);
				trace_lazy = () -> IndependentAmount.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AggregatedIndependentAmount1";
				definition = "Independent amount could be defined at a trade level or portfolio level.  It is assumed that their treatment will be based on the exposure convention that is whether netted together or treated on a gross basis.";
			}
		});
		return mmObject_lazy.get();
	}
}