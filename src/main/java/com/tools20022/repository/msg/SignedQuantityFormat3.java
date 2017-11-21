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
import com.tools20022.repository.choice.Quantity7Choice;
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Signed quantity of security formats.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3#mmShortLongPosition
 * SignedQuantityFormat3.mmShortLongPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3#mmQuantityChoice
 * SignedQuantityFormat3.mmQuantityChoice}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SignedQuantityFormat3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Signed quantity of security formats."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SignedQuantityFormat3", propOrder = {"shortLongPosition", "quantityChoice"})
public class SignedQuantityFormat3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ShortLong1Code shortLongPosition;
	/**
	 * Sign of the quantity of security.
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
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3
	 * SignedQuantityFormat3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtLngPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sign of the quantity of security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortLongPosition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmShortLong;
			componentContext_lazy = () -> SignedQuantityFormat3.mmObject();
			isDerived = false;
			xmlTag = "ShrtLngPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongPosition";
			definition = "Sign of the quantity of security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}
	};
	protected Quantity7Choice quantityChoice;
	/**
	 * Choice between different quantity of security formats.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity7Choice
	 * Quantity7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3
	 * SignedQuantityFormat3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice between different quantity of security formats."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityChoice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> SignedQuantityFormat3.mmObject();
			isDerived = false;
			xmlTag = "QtyChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityChoice";
			definition = "Choice between different quantity of security formats.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity7Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SignedQuantityFormat3.mmShortLongPosition, SignedQuantityFormat3.mmQuantityChoice);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SignedQuantityFormat3";
				definition = "Signed quantity of security formats.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ShrtLngPos", required = true)
	public ShortLong1Code getShortLongPosition() {
		return shortLongPosition;
	}

	public void setShortLongPosition(ShortLong1Code shortLongPosition) {
		this.shortLongPosition = shortLongPosition;
	}

	@XmlElement(name = "QtyChc", required = true)
	public Quantity7Choice getQuantityChoice() {
		return quantityChoice;
	}

	public void setQuantityChoice(Quantity7Choice quantityChoice) {
		this.quantityChoice = quantityChoice;
	}
}