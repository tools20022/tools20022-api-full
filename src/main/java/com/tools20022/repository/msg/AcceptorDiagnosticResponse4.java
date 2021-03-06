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
import com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV04;
import com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV05;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentEnvironment43;
import com.tools20022.repository.msg.TMSTrigger1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Diagnostic response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4#mmEnvironment
 * AcceptorDiagnosticResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4#mmTMSTrigger
 * AcceptorDiagnosticResponse4.mmTMSTrigger}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV04#mmDiagnosticResponse
 * AcceptorDiagnosticResponseV04.mmDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV05#mmDiagnosticResponse
 * AcceptorDiagnosticResponseV05.mmDiagnosticResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorDiagnosticResponse4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Diagnostic response from the acquirer."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse5
 * AcceptorDiagnosticResponse5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse3
 * AcceptorDiagnosticResponse3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorDiagnosticResponse4", propOrder = {"environment", "tMSTrigger"})
public class AcceptorDiagnosticResponse4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment43 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43
	 * CardPaymentEnvironment43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4
	 * AcceptorDiagnosticResponse4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse5#mmEnvironment
	 * AcceptorDiagnosticResponse5.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse3#mmEnvironment
	 * AcceptorDiagnosticResponse3.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorDiagnosticResponse4, CardPaymentEnvironment43> mmEnvironment = new MMMessageAssociationEnd<AcceptorDiagnosticResponse4, CardPaymentEnvironment43>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorDiagnosticResponse4.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorDiagnosticResponse5.mmEnvironment);
			previousVersion_lazy = () -> AcceptorDiagnosticResponse3.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment43.mmObject();
		}

		@Override
		public CardPaymentEnvironment43 getValue(AcceptorDiagnosticResponse4 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcceptorDiagnosticResponse4 obj, CardPaymentEnvironment43 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "TMSTrggr")
	protected TMSTrigger1 tMSTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSTrigger1
	 * TMSTrigger1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
	 * CardPaymentAcquiring.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4
	 * AcceptorDiagnosticResponse4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSTrggr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructions for contacting the terminal management host."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse5#mmTMSTrigger
	 * AcceptorDiagnosticResponse5.mmTMSTrigger}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse3#mmTMSTrigger
	 * AcceptorDiagnosticResponse3.mmTMSTrigger}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorDiagnosticResponse4, Optional<TMSTrigger1>> mmTMSTrigger = new MMMessageAssociationEnd<AcceptorDiagnosticResponse4, Optional<TMSTrigger1>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTMSTrigger;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorDiagnosticResponse4.mmObject();
			isDerived = false;
			xmlTag = "TMSTrggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSTrigger";
			definition = "Instructions for contacting the terminal management host.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorDiagnosticResponse5.mmTMSTrigger);
			previousVersion_lazy = () -> AcceptorDiagnosticResponse3.mmTMSTrigger;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TMSTrigger1.mmObject();
		}

		@Override
		public Optional<TMSTrigger1> getValue(AcceptorDiagnosticResponse4 obj) {
			return obj.getTMSTrigger();
		}

		@Override
		public void setValue(AcceptorDiagnosticResponse4 obj, Optional<TMSTrigger1> value) {
			obj.setTMSTrigger(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorDiagnosticResponse4.mmEnvironment, com.tools20022.repository.msg.AcceptorDiagnosticResponse4.mmTMSTrigger);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorDiagnosticResponseV04.mmDiagnosticResponse, AcceptorDiagnosticResponseV05.mmDiagnosticResponse);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorDiagnosticResponse4";
				definition = "Diagnostic response from the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorDiagnosticResponse5.mmObject());
				previousVersion_lazy = () -> AcceptorDiagnosticResponse3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment43 getEnvironment() {
		return environment;
	}

	public AcceptorDiagnosticResponse4 setEnvironment(CardPaymentEnvironment43 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public Optional<TMSTrigger1> getTMSTrigger() {
		return tMSTrigger == null ? Optional.empty() : Optional.of(tMSTrigger);
	}

	public AcceptorDiagnosticResponse4 setTMSTrigger(TMSTrigger1 tMSTrigger) {
		this.tMSTrigger = tMSTrigger;
		return this;
	}
}