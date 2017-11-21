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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional references linked to the updated interest request such the
 * original InterestRequest identification, and optionaly the InterestResponse
 * identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference20#mmInterestPaymentRequestIdentification
 * Reference20.mmInterestPaymentRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference20#mmInterestPaymentResponseIdentification
 * Reference20.mmInterestPaymentResponseIdentification}</li>
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
 * "Reference20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional references linked to the updated interest request such the original InterestRequest identification, and optionaly the InterestResponse identification."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Reference20", propOrder = {"interestPaymentRequestIdentification", "interestPaymentResponseIdentification"})
public class Reference20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text interestPaymentRequestIdentification;
	/**
	 * Provides the reference to the interest payment request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference20 Reference20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the reference to the interest payment request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPaymentRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference20.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRequestIdentification";
			definition = "Provides the reference to the interest payment request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text interestPaymentResponseIdentification;
	/**
	 * Provides the reference to the interest payment response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference20 Reference20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtRspnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the reference to the interest payment response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPaymentResponseIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference20.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentResponseIdentification";
			definition = "Provides the reference to the interest payment response.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reference20.mmInterestPaymentRequestIdentification, Reference20.mmInterestPaymentResponseIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reference20";
				definition = "Additional references linked to the updated interest request such the original InterestRequest identification, and optionaly the InterestResponse identification.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IntrstPmtReqId", required = true)
	public Max35Text getInterestPaymentRequestIdentification() {
		return interestPaymentRequestIdentification;
	}

	public void setInterestPaymentRequestIdentification(Max35Text interestPaymentRequestIdentification) {
		this.interestPaymentRequestIdentification = interestPaymentRequestIdentification;
	}

	@XmlElement(name = "IntrstPmtRspnId")
	public Max35Text getInterestPaymentResponseIdentification() {
		return interestPaymentResponseIdentification;
	}

	public void setInterestPaymentResponseIdentification(Max35Text interestPaymentResponseIdentification) {
		this.interestPaymentResponseIdentification = interestPaymentResponseIdentification;
	}
}