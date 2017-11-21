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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.LotBreakdown;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of breakdown of a quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#mmLotNumber
 * QuantityBreakdown34.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#mmLotQuantity
 * QuantityBreakdown34.mmLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#mmSecuritiesSubBalanceType
 * QuantityBreakdown34.mmSecuritiesSubBalanceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.LotBreakdown
 * LotBreakdown}</li>
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
 * "QuantityBreakdown34"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of breakdown of a quantity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QuantityBreakdown34", propOrder = {"lotNumber", "lotQuantity", "securitiesSubBalanceType"})
public class QuantityBreakdown34 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification39 lotNumber;
	/**
	 * Identification, for tax purposes, of a lot of identical securities that
	 * are bought at a certain date and at a certain price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification39
	 * GenericIdentification39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34
	 * QuantityBreakdown34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotNumber;
			componentContext_lazy = () -> QuantityBreakdown34.mmObject();
			isDerived = false;
			xmlTag = "LotNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification39.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice lotQuantity;
	/**
	 * Quantity of financial instruments that is part of the lot described.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
	 * LotBreakdown.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34
	 * QuantityBreakdown34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instruments that is part of the lot described."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmSecuritiesQuantity;
			componentContext_lazy = () -> QuantityBreakdown34.mmObject();
			isDerived = false;
			xmlTag = "LotQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotQuantity";
			definition = "Quantity of financial instruments that is part of the lot described.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected GenericIdentification47 securitiesSubBalanceType;
	/**
	 * Specifies the securities sub balance type indicator (example restriction
	 * type for a market infrastructure).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47
	 * GenericIdentification47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34
	 * QuantityBreakdown34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesSubBalanceType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> QuantityBreakdown34.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceType";
			definition = "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification47.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QuantityBreakdown34.mmLotNumber, QuantityBreakdown34.mmLotQuantity, QuantityBreakdown34.mmSecuritiesSubBalanceType);
				trace_lazy = () -> LotBreakdown.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityBreakdown34";
				definition = "Details of breakdown of a quantity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LotNb")
	public GenericIdentification39 getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(com.tools20022.repository.msg.GenericIdentification39 lotNumber) {
		this.lotNumber = lotNumber;
	}

	@XmlElement(name = "LotQty")
	public FinancialInstrumentQuantity1Choice getLotQuantity() {
		return lotQuantity;
	}

	public void setLotQuantity(FinancialInstrumentQuantity1Choice lotQuantity) {
		this.lotQuantity = lotQuantity;
	}

	@XmlElement(name = "SctiesSubBalTp")
	public GenericIdentification47 getSecuritiesSubBalanceType() {
		return securitiesSubBalanceType;
	}

	public void setSecuritiesSubBalanceType(com.tools20022.repository.msg.GenericIdentification47 securitiesSubBalanceType) {
		this.securitiesSubBalanceType = securitiesSubBalanceType;
	}
}