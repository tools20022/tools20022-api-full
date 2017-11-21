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
import com.tools20022.repository.choice.SecurityIdentification5Choice;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14#mmIdentification
 * FinancialInstrument14.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14#mmInstrumentDescription
 * FinancialInstrument14.mmInstrumentDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14#mmUnderlyingInstrumentIdentification
 * FinancialInstrument14.mmUnderlyingInstrumentIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
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
 * "FinancialInstrument14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrument14", propOrder = {"identification", "instrumentDescription", "underlyingInstrumentIdentification"})
public class FinancialInstrument14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification5Choice identification;
	/**
	 * Identifies the financial instrument using a choice of either ISIN, local
	 * code, or a description of the instrument. ISIN is the preferred format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice
	 * SecurityIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14
	 * FinancialInstrument14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the financial instrument using a choice of either ISIN,  local code, or a description of the instrument. ISIN is the preferred format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> FinancialInstrument14.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the financial instrument using a choice of either ISIN,  local code, or a description of the instrument. ISIN is the preferred format.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification5Choice.mmObject();
		}
	};
	protected SecurityInstrumentDescription1 instrumentDescription;
	/**
	 * Provides the ability to describe the instrument through a description and
	 * main characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1
	 * SecurityInstrumentDescription1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14
	 * FinancialInstrument14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the ability to describe the instrument through a description and main characteristics. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentDescription = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> FinancialInstrument14.mmObject();
			isDerived = false;
			xmlTag = "InstrmDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentDescription";
			definition = "Provides the ability to describe the instrument through a description and main characteristics. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityInstrumentDescription1.mmObject();
		}
	};
	protected SecurityIdentification5Choice underlyingInstrumentIdentification;
	/**
	 * Provides details of the underlying financial instrument for which the
	 * transaction report is being sent. If there is more than one underlying
	 * financial instrument then it is the dominant/ultimate instrument that
	 * should be identified here.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice
	 * SecurityIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14
	 * FinancialInstrument14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the underlying financial instrument for which the transaction report is being sent. If there is more than one underlying financial instrument then it is the dominant/ultimate instrument that should be identified here."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> FinancialInstrument14.mmObject();
			isDerived = false;
			xmlTag = "UndrlygInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingInstrumentIdentification";
			definition = "Provides details of the underlying financial instrument for which the transaction report is being sent. If there is more than one underlying financial instrument then it is the dominant/ultimate instrument that should be identified here.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification5Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrument14.mmIdentification, FinancialInstrument14.mmInstrumentDescription, FinancialInstrument14.mmUnderlyingInstrumentIdentification);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrument14";
				definition = "Identifies the financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public SecurityIdentification5Choice getIdentification() {
		return identification;
	}

	public void setIdentification(SecurityIdentification5Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "InstrmDesc")
	public SecurityInstrumentDescription1 getInstrumentDescription() {
		return instrumentDescription;
	}

	public void setInstrumentDescription(com.tools20022.repository.msg.SecurityInstrumentDescription1 instrumentDescription) {
		this.instrumentDescription = instrumentDescription;
	}

	@XmlElement(name = "UndrlygInstrmId")
	public SecurityIdentification5Choice getUnderlyingInstrumentIdentification() {
		return underlyingInstrumentIdentification;
	}

	public void setUnderlyingInstrumentIdentification(SecurityIdentification5Choice underlyingInstrumentIdentification) {
		this.underlyingInstrumentIdentification = underlyingInstrumentIdentification;
	}
}