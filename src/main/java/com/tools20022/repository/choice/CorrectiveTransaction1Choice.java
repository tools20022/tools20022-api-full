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
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.msg.CorrectiveInterbankTransaction1;
import com.tools20022.repository.msg.CorrectivePaymentInitiation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#Initiation
 * CorrectiveTransaction1Choice.Initiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#Interbank
 * CorrectiveTransaction1Choice.Interbank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#CorrectionTransaction
 * ResolutionOfInvestigationV03.CorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04#CorrectionTransaction
 * ResolutionOfInvestigationV04.CorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05#CorrectionTransaction
 * ResolutionOfInvestigationV05.CorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV06#CorrectionTransaction
 * ResolutionOfInvestigationV06.CorrectionTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorrectiveTransaction1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the corrective transaction on which the investigation is processed."
 * </li>
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
public class CorrectiveTransaction1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of elements used to reference the details of the corrective payment
	 * initiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1
	 * CorrectivePaymentInitiation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
	 * Payment.PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice
	 * CorrectiveTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Initn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the corrective payment initiation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#Initiation
	 * CorrectiveTransaction2Choice.Initiation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Initiation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorrectiveTransaction1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PaymentExecution;
			isDerived = false;
			xmlTag = "Initn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initiation";
			definition = "Set of elements used to reference the details of the corrective payment initiation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorrectiveTransaction2Choice.Initiation);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorrectivePaymentInitiation1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to reference the details of the corrective interbank
	 * payment transaction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the corrective interbank payment transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#Interbank
	 * CorrectiveTransaction2Choice.Interbank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Interbank = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorrectiveTransaction1Choice.mmObject();
			businessComponentTrace_lazy = () -> Payment.mmObject();
			isDerived = false;
			xmlTag = "IntrBk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interbank";
			definition = "Set of elements used to reference the details of the corrective interbank payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorrectiveTransaction2Choice.Interbank);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorrectiveInterbankTransaction1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorrectiveTransaction1Choice.Initiation, com.tools20022.repository.choice.CorrectiveTransaction1Choice.Interbank);
				trace_lazy = () -> Payment.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.CorrectionTransaction, com.tools20022.repository.area.camt.ResolutionOfInvestigationV04.CorrectionTransaction,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV05.CorrectionTransaction, com.tools20022.repository.area.camt.ResolutionOfInvestigationV06.CorrectionTransaction);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorrectiveTransaction1Choice";
				definition = "Specifies the corrective transaction on which the investigation is processed.";
				nextVersions_lazy = () -> Arrays.asList(CorrectiveTransaction2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}