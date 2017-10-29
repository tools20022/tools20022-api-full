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
import com.tools20022.repository.msg.SecuritiesReferenceDataReport5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice defining financial instruments that are either new or have been
 * modified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice#ModifiedRecord
 * SecuritiesReferenceDeltaStatusReport2Choice.ModifiedRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice#NewRecord
 * SecuritiesReferenceDeltaStatusReport2Choice.NewRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice#TerminatedRecord
 * SecuritiesReferenceDeltaStatusReport2Choice.TerminatedRecord}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01#FinancialInstrument
 * FinancialInstrumentReportingReferenceDataDeltaReportV01.FinancialInstrument}</li>
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
 * "SecuritiesReferenceDeltaStatusReport2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice defining financial instruments that are either new or have been modified. "
 * </li>
 * </ul>
 */
public class SecuritiesReferenceDeltaStatusReport2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies data that has been modified since the previous report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice
	 * SecuritiesReferenceDeltaStatusReport2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdRcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies data that has been modified since the previous report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ModifiedRecord = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesReferenceDeltaStatusReport2Choice.mmObject();
			isDerived = false;
			xmlTag = "ModfdRcrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedRecord";
			definition = "Specifies data that has been modified since the previous report.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesReferenceDataReport5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies new instruments that have been added since the previous report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice
	 * SecuritiesReferenceDeltaStatusReport2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewRcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies new instruments that have been added since the previous report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NewRecord = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesReferenceDeltaStatusReport2Choice.mmObject();
			isDerived = false;
			xmlTag = "NewRcrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewRecord";
			definition = "Specifies new instruments that have been added since the previous report.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesReferenceDataReport5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies instruments which have been terminated / have reached there
	 * pre-set termination data and are no longer valid instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice
	 * SecuritiesReferenceDeltaStatusReport2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntdRcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminatedRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies instruments which have been terminated / have reached there pre-set termination data and are no longer valid instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TerminatedRecord = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesReferenceDeltaStatusReport2Choice.mmObject();
			isDerived = false;
			xmlTag = "TermntdRcrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminatedRecord";
			definition = "Specifies instruments which have been terminated / have reached there pre-set termination data and are no longer valid instruments.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesReferenceDataReport5.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.ModifiedRecord, com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.NewRecord,
						com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.TerminatedRecord);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01.FinancialInstrument);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesReferenceDeltaStatusReport2Choice";
				definition = "Choice defining financial instruments that are either new or have been modified. ";
			}
		});
		return mmObject_lazy.get();
	}
}