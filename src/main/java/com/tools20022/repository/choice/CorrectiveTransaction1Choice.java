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
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV03;
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV04;
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV05;
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV06;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorrectiveInterbankTransaction1;
import com.tools20022.repository.msg.CorrectivePaymentInitiation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the corrective transaction on which the investigation is processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#mmInitiation
 * CorrectiveTransaction1Choice.mmInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#mmInterbank
 * CorrectiveTransaction1Choice.mmInterbank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmCorrectionTransaction
 * ResolutionOfInvestigationV03.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04#mmCorrectionTransaction
 * ResolutionOfInvestigationV04.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05#mmCorrectionTransaction
 * ResolutionOfInvestigationV05.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV06#mmCorrectionTransaction
 * ResolutionOfInvestigationV06.mmCorrectionTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorrectiveTransaction1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the corrective transaction on which the investigation is processed."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice
 * CorrectiveTransaction2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorrectiveTransaction1Choice", propOrder = {"initiation", "interbank"})
public class CorrectiveTransaction1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Initn", required = true)
	protected CorrectivePaymentInitiation1 initiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1
	 * CorrectivePaymentInitiation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice
	 * CorrectiveTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Initn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the corrective payment initiation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#mmInitiation
	 * CorrectiveTransaction2Choice.mmInitiation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorrectiveTransaction1Choice, CorrectivePaymentInitiation1> mmInitiation = new MMMessageAssociationEnd<CorrectiveTransaction1Choice, CorrectivePaymentInitiation1>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> com.tools20022.repository.choice.CorrectiveTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "Initn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initiation";
			definition = "Set of elements used to reference the details of the corrective payment initiation.";
			nextVersions_lazy = () -> Arrays.asList(CorrectiveTransaction2Choice.mmInitiation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorrectivePaymentInitiation1.mmObject();
		}

		@Override
		public CorrectivePaymentInitiation1 getValue(CorrectiveTransaction1Choice obj) {
			return obj.getInitiation();
		}

		@Override
		public void setValue(CorrectiveTransaction1Choice obj, CorrectivePaymentInitiation1 value) {
			obj.setInitiation(value);
		}
	};
	@XmlElement(name = "IntrBk", required = true)
	protected CorrectiveInterbankTransaction1 interbank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1
	 * CorrectiveInterbankTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice
	 * CorrectiveTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the corrective interbank payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#mmInterbank
	 * CorrectiveTransaction2Choice.mmInterbank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorrectiveTransaction1Choice, CorrectiveInterbankTransaction1> mmInterbank = new MMMessageAssociationEnd<CorrectiveTransaction1Choice, CorrectiveInterbankTransaction1>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CorrectiveTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interbank";
			definition = "Set of elements used to reference the details of the corrective interbank payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(CorrectiveTransaction2Choice.mmInterbank);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorrectiveInterbankTransaction1.mmObject();
		}

		@Override
		public CorrectiveInterbankTransaction1 getValue(CorrectiveTransaction1Choice obj) {
			return obj.getInterbank();
		}

		@Override
		public void setValue(CorrectiveTransaction1Choice obj, CorrectiveInterbankTransaction1 value) {
			obj.setInterbank(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorrectiveTransaction1Choice.mmInitiation, com.tools20022.repository.choice.CorrectiveTransaction1Choice.mmInterbank);
				messageBuildingBlock_lazy = () -> Arrays.asList(ResolutionOfInvestigationV03.mmCorrectionTransaction, ResolutionOfInvestigationV04.mmCorrectionTransaction, ResolutionOfInvestigationV05.mmCorrectionTransaction,
						ResolutionOfInvestigationV06.mmCorrectionTransaction);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorrectiveTransaction1Choice";
				definition = "Specifies the corrective transaction on which the investigation is processed.";
				nextVersions_lazy = () -> Arrays.asList(CorrectiveTransaction2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CorrectivePaymentInitiation1 getInitiation() {
		return initiation;
	}

	public CorrectiveTransaction1Choice setInitiation(CorrectivePaymentInitiation1 initiation) {
		this.initiation = Objects.requireNonNull(initiation);
		return this;
	}

	public CorrectiveInterbankTransaction1 getInterbank() {
		return interbank;
	}

	public CorrectiveTransaction1Choice setInterbank(CorrectiveInterbankTransaction1 interbank) {
		this.interbank = Objects.requireNonNull(interbank);
		return this;
	}
}