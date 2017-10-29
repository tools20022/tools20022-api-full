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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.Participation1;
import com.tools20022.repository.msg.Participation2;
import com.tools20022.repository.msg.Participation3;
import com.tools20022.repository.msg.Participation4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the number of voting rights and of outstanding securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingParticipation" src="doc-files/MeetingParticipation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#TotalNumberOfSecuritiesOutstanding
 * MeetingParticipation.TotalNumberOfSecuritiesOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#TotalNumberOfVotingRights
 * MeetingParticipation.TotalNumberOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#CalculationDate
 * MeetingParticipation.CalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#TotalNumberOfSecurities
 * MeetingParticipation.TotalNumberOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#Meeting
 * MeetingParticipation.Meeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Participation
 * Meeting.Participation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Participation1 Participation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Participation2 Participation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Participation3 Participation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Participation4 Participation4}</li>
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
 * "MeetingParticipation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the number of voting rights and of outstanding securities."</li>
 * </ul>
 */
public class MeetingParticipation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of securities admitted to the vote, expressed as an amount and a
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#TotalNumberOfSecuritiesOutstanding
	 * MeetingNotice1.TotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#TotalNumberOfSecuritiesOutstanding
	 * MeetingNotice2.TotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#TotalNumberOfSecuritiesOutstanding
	 * MeetingNotice3.TotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation1#TotalNumberOfSecuritiesOutstanding
	 * Participation1.TotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation2#TotalNumberOfSecuritiesOutstanding
	 * Participation2.TotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation3#TotalNumberOfSecuritiesOutstanding
	 * Participation3.TotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation4#TotalNumberOfSecuritiesOutstanding
	 * Participation4.TotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#TotalNumberOfSecuritiesOutstanding
	 * MeetingNotice4.TotalNumberOfSecuritiesOutstanding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSecuritiesOutstanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities admitted to the vote, expressed as an amount and a currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalNumberOfSecuritiesOutstanding = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.TotalNumberOfSecuritiesOutstanding, com.tools20022.repository.msg.MeetingNotice2.TotalNumberOfSecuritiesOutstanding,
					com.tools20022.repository.msg.MeetingNotice3.TotalNumberOfSecuritiesOutstanding, com.tools20022.repository.msg.Participation1.TotalNumberOfSecuritiesOutstanding,
					com.tools20022.repository.msg.Participation2.TotalNumberOfSecuritiesOutstanding, com.tools20022.repository.msg.Participation3.TotalNumberOfSecuritiesOutstanding,
					com.tools20022.repository.msg.Participation4.TotalNumberOfSecuritiesOutstanding, com.tools20022.repository.msg.MeetingNotice4.TotalNumberOfSecuritiesOutstanding);
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfSecuritiesOutstanding";
			definition = "Number of securities admitted to the vote, expressed as an amount and a currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Number of rights admitted to the vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#TotalNumberOfVotingRights
	 * MeetingNotice1.TotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#TotalNumberOfVotingRights
	 * MeetingNotice2.TotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#TotalNumberOfVotingRights
	 * MeetingNotice3.TotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation1#TotalNumberOfVotingRights
	 * Participation1.TotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation2#TotalNumberOfVotingRights
	 * Participation2.TotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation3#TotalNumberOfVotingRights
	 * Participation3.TotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation4#TotalNumberOfVotingRights
	 * Participation4.TotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#TotalNumberOfVotingRights
	 * MeetingNotice4.TotalNumberOfVotingRights}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of rights admitted to the vote."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalNumberOfVotingRights = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.TotalNumberOfVotingRights, com.tools20022.repository.msg.MeetingNotice2.TotalNumberOfVotingRights,
					com.tools20022.repository.msg.MeetingNotice3.TotalNumberOfVotingRights, com.tools20022.repository.msg.Participation1.TotalNumberOfVotingRights, com.tools20022.repository.msg.Participation2.TotalNumberOfVotingRights,
					com.tools20022.repository.msg.Participation3.TotalNumberOfVotingRights, com.tools20022.repository.msg.Participation4.TotalNumberOfVotingRights, com.tools20022.repository.msg.MeetingNotice4.TotalNumberOfVotingRights);
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfVotingRights";
			definition = "Number of rights admitted to the vote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Date of calculation of the total number of oustanding securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation1#CalculationDate
	 * Participation1.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation2#CalculationDate
	 * Participation2.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation3#CalculationDate
	 * Participation3.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Participation4#CalculationDate
	 * Participation4.CalculationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of calculation of the total number of oustanding securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Participation1.CalculationDate, com.tools20022.repository.msg.Participation2.CalculationDate, com.tools20022.repository.msg.Participation3.CalculationDate,
					com.tools20022.repository.msg.Participation4.CalculationDate);
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date of calculation of the total number of oustanding securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of securities admitted to the vote, expressed as a number of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities admitted to the vote, expressed as a number of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalNumberOfSecurities = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfSecurities";
			definition = "Number of securities admitted to the vote, expressed as a number of securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Meeting for which participation conditions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#Participation
	 * Meeting.Participation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which participation conditions are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which participation conditions are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Participation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingParticipation";
				definition = "Specifies the number of voting rights and of outstanding securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.Participation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingParticipation.TotalNumberOfSecuritiesOutstanding, com.tools20022.repository.entity.MeetingParticipation.TotalNumberOfVotingRights,
						com.tools20022.repository.entity.MeetingParticipation.CalculationDate, com.tools20022.repository.entity.MeetingParticipation.TotalNumberOfSecurities, com.tools20022.repository.entity.MeetingParticipation.Meeting);
				derivationComponent_lazy = () -> Arrays.asList(Participation1.mmObject(), Participation2.mmObject(), Participation3.mmObject(), Participation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}