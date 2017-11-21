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
import com.tools20022.repository.choice.OpeningBalance1Choice;
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Opening balance for the statement period (first opening balance) or of this
 * page (intermediary opening balance).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OpeningBalance1#mmShortLongIndicator
 * OpeningBalance1.mmShortLongIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OpeningBalance1#mmOpeningBalance
 * OpeningBalance1.mmOpeningBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "OpeningBalance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OpeningBalance3
 * OpeningBalance3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OpeningBalance1", propOrder = {"shortLongIndicator", "openingBalance"})
public class OpeningBalance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ShortLong1Code shortLongIndicator;
	/**
	 * Indication that the position is short or long.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLong1Code
	 * ShortLong1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmShortLong
	 * SecuritiesBalance.mmShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance1
	 * OpeningBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtLngInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that the position is short or long."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#mmShortLongIndicator
	 * OpeningBalance3.mmShortLongIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortLongIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmShortLong;
			componentContext_lazy = () -> OpeningBalance1.mmObject();
			isDerived = false;
			xmlTag = "ShrtLngInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongIndicator";
			definition = "Indication that the position is short or long.";
			nextVersions_lazy = () -> Arrays.asList(OpeningBalance3.mmShortLongIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}
	};
	protected OpeningBalance1Choice openingBalance;
	/**
	 * Opening balance for the statement period (first opening balance) or of
	 * this page (intermediary opening balance)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance1Choice
	 * OpeningBalance1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance1
	 * OpeningBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningBalance3#mmOpeningBalance
	 * OpeningBalance3.mmOpeningBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> OpeningBalance1.mmObject();
			isDerived = false;
			xmlTag = "OpngBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningBalance";
			definition = "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance)";
			nextVersions_lazy = () -> Arrays.asList(OpeningBalance3.mmOpeningBalance);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OpeningBalance1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OpeningBalance1.mmShortLongIndicator, OpeningBalance1.mmOpeningBalance);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OpeningBalance1";
				definition = "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance).";
				nextVersions_lazy = () -> Arrays.asList(OpeningBalance3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ShrtLngInd", required = true)
	public ShortLong1Code getShortLongIndicator() {
		return shortLongIndicator;
	}

	public void setShortLongIndicator(ShortLong1Code shortLongIndicator) {
		this.shortLongIndicator = shortLongIndicator;
	}

	@XmlElement(name = "OpngBal", required = true)
	public OpeningBalance1Choice getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(OpeningBalance1Choice openingBalance) {
		this.openingBalance = openingBalance;
	}
}