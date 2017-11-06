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
import com.tools20022.repository.datatype.Max128Text;
import com.tools20022.repository.entity.TradingSession;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The details of a specific trading session.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingSession1#mmTradingSessionIdentification
 * TradingSession1.mmTradingSessionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingSession1#mmTradingSessionSubIdentification
 * TradingSession1.mmTradingSessionSubIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradingSession
 * TradingSession}</li>
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
 * "TradingSession1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The details of a specific trading session."</li>
 * </ul>
 */
public class TradingSession1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max128Text tradingSessionIdentification;
	/**
	 * Identification of a specific execution time bracket code through its
	 * trading session name or description.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTradingSessionName
	 * TradingSession.mmTradingSessionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a specific execution time bracket code through its trading session name or description."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingSessionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradingSession.mmTradingSessionName;
			componentContext_lazy = () -> TradingSession1.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionIdentification";
			definition = "Identification of a specific execution time bracket code through its trading session name or description.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	protected Max128Text tradingSessionSubIdentification;
	/**
	 * Optional market assigned sub identifier for a trading session. Usage is
	 * determined by market or counterparties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTradingSessionName
	 * TradingSession.mmTradingSessionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsnSubId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionSubIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Optional market assigned sub identifier for a trading session. Usage is determined by market or counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingSessionSubIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradingSession.mmTradingSessionName;
			componentContext_lazy = () -> TradingSession1.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnSubId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionSubIdentification";
			definition = "Optional market assigned sub identifier for a trading session. Usage is determined by market or counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradingSession1.mmTradingSessionIdentification, com.tools20022.repository.msg.TradingSession1.mmTradingSessionSubIdentification);
				trace_lazy = () -> TradingSession.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradingSession1";
				definition = "The details of a specific trading session.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max128Text getTradingSessionIdentification() {
		return tradingSessionIdentification;
	}

	public void setTradingSessionIdentification(Max128Text tradingSessionIdentification) {
		this.tradingSessionIdentification = tradingSessionIdentification;
	}

	public Max128Text getTradingSessionSubIdentification() {
		return tradingSessionSubIdentification;
	}

	public void setTradingSessionSubIdentification(Max128Text tradingSessionSubIdentification) {
		this.tradingSessionSubIdentification = tradingSessionSubIdentification;
	}
}