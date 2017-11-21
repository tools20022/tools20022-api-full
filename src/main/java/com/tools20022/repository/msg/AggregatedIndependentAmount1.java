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
import com.tools20022.repository.entity.IndependentAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1#mmTrade
 * AggregatedIndependentAmount1.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1#mmValueAtRisk
 * AggregatedIndependentAmount1.mmValueAtRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1#mmNetOpenPosition
 * AggregatedIndependentAmount1.mmNetOpenPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1#mmOtherAmount
 * AggregatedIndependentAmount1.mmOtherAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IndependentAmount
 * IndependentAmount}</li>
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
 * "AggregatedIndependentAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent amount could be defined at a trade level or portfolio level.  It is assumed that their treatment will be based on the exposure convention that is whether netted together or treated on a gross basis."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AggregatedIndependentAmount1", propOrder = {"trade", "valueAtRisk", "netOpenPosition", "otherAmount"})
public class AggregatedIndependentAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected IndependentAmount1 trade;
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
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmIndependentAmountPerTrade
	 * IndependentAmount.mmIndependentAmountPerTrade}</li>
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
	public static final MMMessageAttribute mmTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IndependentAmount.mmIndependentAmountPerTrade;
			componentContext_lazy = () -> AggregatedIndependentAmount1.mmObject();
			isDerived = false;
			xmlTag = "Trad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Total independent amount defined in the confirmations of individual trades.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.IndependentAmount1.mmObject();
		}
	};
	protected IndependentAmount1 valueAtRisk;
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
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmIndependentAmountValueAtRisk
	 * IndependentAmount.mmIndependentAmountValueAtRisk}</li>
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
	public static final MMMessageAttribute mmValueAtRisk = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IndependentAmount.mmIndependentAmountValueAtRisk;
			componentContext_lazy = () -> AggregatedIndependentAmount1.mmObject();
			isDerived = false;
			xmlTag = "ValAtRsk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAtRisk";
			definition = "Portfolio level independent amount that reflects portfolio change over a short time period using statistical techniques such as volatility and risk factor correlations.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.IndependentAmount1.mmObject();
		}
	};
	protected IndependentAmount1 netOpenPosition;
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
	 * {@linkplain com.tools20022.repository.entity.IndependentAmount#mmIndependentAmountNetOpenPosition
	 * IndependentAmount.mmIndependentAmountNetOpenPosition}</li>
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
	public static final MMMessageAttribute mmNetOpenPosition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IndependentAmount.mmIndependentAmountNetOpenPosition;
			componentContext_lazy = () -> AggregatedIndependentAmount1.mmObject();
			isDerived = false;
			xmlTag = "NetOpnPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetOpenPosition";
			definition = "Portfolio level independent amount related to parties net open position. Net open position means the total of the net long FX and the net options in respect of each currency where: net long FX for any currency shall be the net amount (if any) of that currency which the party “A” is long as against party “B” in respect of all FX transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.IndependentAmount1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.IndependentAmount2> otherAmount;
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
	public static final MMMessageAttribute mmOtherAmount = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> IndependentAmount.mmObject();
			componentContext_lazy = () -> AggregatedIndependentAmount1.mmObject();
			isDerived = false;
			xmlTag = "OthrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmount";
			definition = "Any other amount that should be considered to calculate the independent amount.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.IndependentAmount2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AggregatedIndependentAmount1.mmTrade, AggregatedIndependentAmount1.mmValueAtRisk, AggregatedIndependentAmount1.mmNetOpenPosition, AggregatedIndependentAmount1.mmOtherAmount);
				trace_lazy = () -> IndependentAmount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AggregatedIndependentAmount1";
				definition = "Independent amount could be defined at a trade level or portfolio level.  It is assumed that their treatment will be based on the exposure convention that is whether netted together or treated on a gross basis.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Trad")
	public IndependentAmount1 getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.msg.IndependentAmount1 trade) {
		this.trade = trade;
	}

	@XmlElement(name = "ValAtRsk")
	public IndependentAmount1 getValueAtRisk() {
		return valueAtRisk;
	}

	public void setValueAtRisk(com.tools20022.repository.msg.IndependentAmount1 valueAtRisk) {
		this.valueAtRisk = valueAtRisk;
	}

	@XmlElement(name = "NetOpnPos")
	public IndependentAmount1 getNetOpenPosition() {
		return netOpenPosition;
	}

	public void setNetOpenPosition(com.tools20022.repository.msg.IndependentAmount1 netOpenPosition) {
		this.netOpenPosition = netOpenPosition;
	}

	@XmlElement(name = "OthrAmt")
	public List<IndependentAmount2> getOtherAmount() {
		return otherAmount;
	}

	public void setOtherAmount(List<com.tools20022.repository.msg.IndependentAmount2> otherAmount) {
		this.otherAmount = otherAmount;
	}
}