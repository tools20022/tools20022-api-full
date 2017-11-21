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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
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
 * Choice between a status quantity or a quantity to receive for the quantity of
 * financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice#mmStatusQuantity
 * StatusOrQuantityToReceive2Choice.mmStatusQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice#mmQuantityToReceive
 * StatusOrQuantityToReceive2Choice.mmQuantityToReceive}</li>
 * </ul>
 * </li>
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
 * "StatusOrQuantityToReceive2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a status quantity or a quantity to receive for the quantity of financial instrument."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatusOrQuantityToReceive2Choice", propOrder = {"statusQuantity", "quantityToReceive"})
public class StatusOrQuantityToReceive2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Quantity10Choice statusQuantity;
	/**
	 * Quantity of securities that has been assigned the status indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity10Choice
	 * Quantity10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmStatusQuantity
	 * SecuritiesProceedsDefinition.mmStatusQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice
	 * StatusOrQuantityToReceive2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities that has been assigned the status indicated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmStatusQuantity;
			componentContext_lazy = () -> StatusOrQuantityToReceive2Choice.mmObject();
			isDerived = false;
			xmlTag = "StsQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusQuantity";
			definition = "Quantity of securities that has been assigned the status indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.Quantity10Choice.mmObject();
		}
	};
	protected Quantity10Choice quantityToReceive;
	/**
	 * Quantity of the benefits that the account owner wants to receive, for
	 * example, as a result of dividend reinvestment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity10Choice
	 * Quantity10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmQuantityToReceive
	 * SecuritiesProceedsDefinition.mmQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice
	 * StatusOrQuantityToReceive2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToRcv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityToReceive = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmQuantityToReceive;
			componentContext_lazy = () -> StatusOrQuantityToReceive2Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToRcv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToReceive";
			definition = "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.Quantity10Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatusOrQuantityToReceive2Choice.mmStatusQuantity, StatusOrQuantityToReceive2Choice.mmQuantityToReceive);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "StatusOrQuantityToReceive2Choice";
				definition = "Choice between a status quantity or a quantity to receive for the quantity of financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StsQty", required = true)
	public Quantity10Choice getStatusQuantity() {
		return statusQuantity;
	}

	public void setStatusQuantity(com.tools20022.repository.choice.Quantity10Choice statusQuantity) {
		this.statusQuantity = statusQuantity;
	}

	@XmlElement(name = "QtyToRcv", required = true)
	public Quantity10Choice getQuantityToReceive() {
		return quantityToReceive;
	}

	public void setQuantityToReceive(com.tools20022.repository.choice.Quantity10Choice quantityToReceive) {
		this.quantityToReceive = quantityToReceive;
	}
}