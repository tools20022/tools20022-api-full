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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Method of payment for the remittance of the CSD or the NCB to the invoicing
 * party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentMethod1Choice#mmCode
 * PaymentMethod1Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentMethod1Choice#mmProprietary
 * PaymentMethod1Choice.mmProprietary}</li>
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
 * "PaymentMethod1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Method of payment for the remittance of the CSD or the NCB to the invoicing party."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentMethod1Choice", propOrder = {"code", "proprietary"})
public class PaymentMethod1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max4AlphaNumericText code;
	/**
	 * Method of payment for the remittance of the CSD or NCB to the invoicing
	 * party, in a coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentMethod1Choice
	 * PaymentMethod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method of payment for the remittance of the CSD or NCB to the invoicing party, in a coded form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentMethod1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Method of payment for the remittance of the CSD or NCB to the invoicing party, in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected Max210Text proprietary;
	/**
	 * Method of payment for the remittance of the CSD or the NCB to the
	 * invoicing party, in a proprietary free text format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentMethod1Choice
	 * PaymentMethod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method of payment for the remittance of the CSD or the NCB to the invoicing party, in a proprietary free text format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietary = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentMethod1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Method of payment for the remittance of the CSD or the NCB to the invoicing party, in a proprietary free text format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentMethod1Choice.mmCode, PaymentMethod1Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentMethod1Choice";
				definition = "Method of payment for the remittance of the CSD or the NCB to the invoicing party.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cd", required = true)
	public Max4AlphaNumericText getCode() {
		return code;
	}

	public void setCode(Max4AlphaNumericText code) {
		this.code = code;
	}

	@XmlElement(name = "Prtry", required = true)
	public Max210Text getProprietary() {
		return proprietary;
	}

	public void setProprietary(Max210Text proprietary) {
		this.proprietary = proprietary;
	}
}