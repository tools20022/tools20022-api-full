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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.IncentivePremium1;
import com.tools20022.repository.msg.IncentivePremium2;
import com.tools20022.repository.msg.IncentivePremium3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash premium made available if the securities holder consents or participates
 * to an event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IncentivePremium" src="doc-files/IncentivePremium.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#PerSecurity
 * IncentivePremium.PerSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#PerVote
 * IncentivePremium.PerVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#PerAttendee
 * IncentivePremium.PerAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#Description
 * IncentivePremium.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#PremiumAmount
 * IncentivePremium.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#PaymentDate
 * IncentivePremium.PaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#Meeting
 * IncentivePremium.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#CorporateActionDistribution
 * IncentivePremium.CorporateActionDistribution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#IncentivePremium
 * Meeting.IncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#IncentivePremium
 * Distribution.IncentivePremium}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium3#Type
 * IncentivePremium3.Type}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium1
 * IncentivePremium1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium2
 * IncentivePremium2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium3
 * IncentivePremium3}</li>
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
 * "IncentivePremium"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash premium made available if the securities holder consents or participates to an event."
 * </li>
 * </ul>
 */
public class IncentivePremium {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of securities giving right to a premium.
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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#PerSecurity
	 * IncentivePremium1.PerSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#PerSecurity
	 * IncentivePremium2.PerSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#PerSecurity
	 * IncentivePremiumType1Choice.PerSecurity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of securities giving right to a premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PerSecurity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium1.PerSecurity, com.tools20022.repository.msg.IncentivePremium2.PerSecurity,
					com.tools20022.repository.choice.IncentivePremiumType1Choice.PerSecurity);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerSecurity";
			definition = "Number of securities giving right to a premium.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes giving right to a premium.
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
	 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium1#PerVote
	 * IncentivePremium1.PerVote}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium2#PerVote
	 * IncentivePremium2.PerVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#PerVote
	 * IncentivePremiumType1Choice.PerVote}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes giving right to a premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PerVote = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium1.PerVote, com.tools20022.repository.msg.IncentivePremium2.PerVote, com.tools20022.repository.choice.IncentivePremiumType1Choice.PerVote);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerVote";
			definition = "Number of votes giving right to a premium.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates that the premium is given per attendee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#PerAttendee
	 * IncentivePremium1.PerAttendee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#PerAttendee
	 * IncentivePremium2.PerAttendee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#PerAttendee
	 * IncentivePremiumType1Choice.PerAttendee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerAttendee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the premium is given per attendee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PerAttendee = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium1.PerAttendee, com.tools20022.repository.msg.IncentivePremium2.PerAttendee,
					com.tools20022.repository.choice.IncentivePremiumType1Choice.PerAttendee);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerAttendee";
			definition = "Indicates that the premium is given per attendee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Description of the premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#PremiumDescription
	 * IncentivePremium1.PremiumDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#Description
	 * IncentivePremium2.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium3#Description
	 * IncentivePremium3.Description}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium1.PremiumDescription, com.tools20022.repository.msg.IncentivePremium2.Description, com.tools20022.repository.msg.IncentivePremium3.Description);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of the premium.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Cash premium paid per security, per vote or per attendee.
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
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#PremiumAmount
	 * IncentivePremium1.PremiumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium2#Amount
	 * IncentivePremium2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium3#Amount
	 * IncentivePremium3.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash premium paid per security, per vote or per attendee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PremiumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium1.PremiumAmount, com.tools20022.repository.msg.IncentivePremium2.Amount, com.tools20022.repository.msg.IncentivePremium3.Amount);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Cash premium paid per security, per vote or per attendee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date/time for the payment of the premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#PaymentDate
	 * IncentivePremium1.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#PaymentDate
	 * IncentivePremium2.PaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium3#PaymentDate
	 * IncentivePremium3.PaymentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time for the payment of the premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium1.PaymentDate, com.tools20022.repository.msg.IncentivePremium2.PaymentDate, com.tools20022.repository.msg.IncentivePremium3.PaymentDate);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date/time for the payment of the premium.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Meeting for which an incentive premium is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#IncentivePremium
	 * Meeting.IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which an incentive premium is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which an incentive premium is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.IncentivePremium;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * CorporateActionDistribution for which an incentive premium is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#IncentivePremium
	 * Distribution.IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDistribution for which an incentive premium is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "CorporateActionDistribution for which an incentive premium is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.IncentivePremium;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IncentivePremium";
				definition = "Cash premium made available if the securities holder consents or participates to an event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.IncentivePremium, com.tools20022.repository.entity.Distribution.IncentivePremium);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncentivePremium3.Type);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IncentivePremium.PerSecurity, com.tools20022.repository.entity.IncentivePremium.PerVote, com.tools20022.repository.entity.IncentivePremium.PerAttendee,
						com.tools20022.repository.entity.IncentivePremium.Description, com.tools20022.repository.entity.IncentivePremium.PremiumAmount, com.tools20022.repository.entity.IncentivePremium.PaymentDate,
						com.tools20022.repository.entity.IncentivePremium.Meeting, com.tools20022.repository.entity.IncentivePremium.CorporateActionDistribution);
				derivationComponent_lazy = () -> Arrays.asList(IncentivePremium1.mmObject(), IncentivePremium2.mmObject(), IncentivePremium3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}