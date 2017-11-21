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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Rate name specifies the reference rate or basis rate on which a variable rate
 * is based (ex: EONIA, EURIBOR, LIBOR, FEFUND, EURREPO).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RateName1#mmIssuer
 * RateName1.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateName1#mmRateName
 * RateName1.mmRateName}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateName1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rate name specifies the reference rate or basis rate on which a variable rate is based (ex: EONIA, EURIBOR, LIBOR, FEFUND, EURREPO)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RateName1", propOrder = {"issuer", "rateName"})
public class RateName1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max8Text issuer;
	/**
	 * Entity that assigns the identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.RateName1
	 * RateName1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that assigns the identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RateName1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Entity that assigns the identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	protected Max35Text rateName;
	/**
	 * Rate Name specifies the reference rate or basis rate on which a variable
	 * rate is based (ex: EONIA, EURIBOR, LIBOR, FEFUND, EURREPO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.RateName1
	 * RateName1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate Name specifies the reference rate or basis rate on which a variable rate is based (ex: EONIA, EURIBOR, LIBOR, FEFUND, EURREPO)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRateName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RateName1.mmObject();
			isDerived = false;
			xmlTag = "RateNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateName";
			definition = "Rate Name specifies the reference rate or basis rate on which a variable rate is based (ex: EONIA, EURIBOR, LIBOR, FEFUND, EURREPO).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RateName1.mmIssuer, RateName1.mmRateName);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateName1";
				definition = "Rate name specifies the reference rate or basis rate on which a variable rate is based (ex: EONIA, EURIBOR, LIBOR, FEFUND, EURREPO).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Issr")
	public Max8Text getIssuer() {
		return issuer;
	}

	public void setIssuer(Max8Text issuer) {
		this.issuer = issuer;
	}

	@XmlElement(name = "RateNm", required = true)
	public Max35Text getRateName() {
		return rateName;
	}

	public void setRateName(Max35Text rateName) {
		this.rateName = rateName;
	}
}