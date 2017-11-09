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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.IncentivePremiumType1Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmIncentivePremium
 * Meeting.mmIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmIncentivePremium
 * Distribution.mmIncentivePremium}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium3#mmType
 * IncentivePremium3.mmType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerSecurity
 * IncentivePremium.mmPerSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerVote
 * IncentivePremium.mmPerVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerAttendee
 * IncentivePremium.mmPerAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmDescription
 * IncentivePremium.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPremiumAmount
 * IncentivePremium.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPaymentDate
 * IncentivePremium.mmPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#mmMeeting
 * IncentivePremium.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmCorporateActionDistribution
 * IncentivePremium.mmCorporateActionDistribution}</li>
 * </ul>
 * </li>
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
 * "IncentivePremium"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash premium made available if the securities holder consents or participates to an event."
 * </li>
 * </ul>
 */
public class IncentivePremium {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Number perSecurity;
	/**
	 * Number of securities giving right to a premium.
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
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerSecurity
	 * IncentivePremium1.mmPerSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerSecurity
	 * IncentivePremium2.mmPerSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#mmPerSecurity
	 * IncentivePremiumType1Choice.mmPerSecurity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPerSecurity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IncentivePremium1.mmPerSecurity, IncentivePremium2.mmPerSecurity, IncentivePremiumType1Choice.mmPerSecurity);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerSecurity";
			definition = "Number of securities giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number perVote;
	/**
	 * Number of votes giving right to a premium.
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
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerVote
	 * IncentivePremium1.mmPerVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerVote
	 * IncentivePremium2.mmPerVote}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#mmPerVote
	 * IncentivePremiumType1Choice.mmPerVote}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPerVote = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IncentivePremium1.mmPerVote, IncentivePremium2.mmPerVote, IncentivePremiumType1Choice.mmPerVote);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerVote";
			definition = "Number of votes giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected YesNoIndicator perAttendee;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPerAttendee
	 * IncentivePremium1.mmPerAttendee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPerAttendee
	 * IncentivePremium2.mmPerAttendee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IncentivePremiumType1Choice#mmPerAttendee
	 * IncentivePremiumType1Choice.mmPerAttendee}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPerAttendee = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IncentivePremium1.mmPerAttendee, IncentivePremium2.mmPerAttendee, IncentivePremiumType1Choice.mmPerAttendee);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerAttendee";
			definition = "Indicates that the premium is given per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max350Text description;
	/**
	 * Description of the premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPremiumDescription
	 * IncentivePremium1.mmPremiumDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmDescription
	 * IncentivePremium2.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium3#mmDescription
	 * IncentivePremium3.mmDescription}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IncentivePremium1.mmPremiumDescription, IncentivePremium2.mmDescription, IncentivePremium3.mmDescription);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of the premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected CurrencyAndAmount premiumAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPremiumAmount
	 * IncentivePremium1.mmPremiumAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium2#mmAmount
	 * IncentivePremium2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IncentivePremium3#mmAmount
	 * IncentivePremium3.mmAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPremiumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IncentivePremium1.mmPremiumAmount, IncentivePremium2.mmAmount, IncentivePremium3.mmAmount);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Cash premium paid per security, per vote or per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ISODateTime paymentDate;
	/**
	 * Date/time for the payment of the premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium1#mmPaymentDate
	 * IncentivePremium1.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium2#mmPaymentDate
	 * IncentivePremium2.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncentivePremium3#mmPaymentDate
	 * IncentivePremium3.mmPaymentDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IncentivePremium1.mmPaymentDate, IncentivePremium2.mmPaymentDate, IncentivePremium3.mmPaymentDate);
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date/time for the payment of the premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Meeting meeting;
	/**
	 * Meeting for which an incentive premium is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmIncentivePremium
	 * Meeting.mmIncentivePremium}</li>
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
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which an incentive premium is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmIncentivePremium;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	protected Distribution corporateActionDistribution;
	/**
	 * CorporateActionDistribution for which an incentive premium is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmIncentivePremium
	 * Distribution.mmIncentivePremium}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> IncentivePremium.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "CorporateActionDistribution for which an incentive premium is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmIncentivePremium;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IncentivePremium";
				definition = "Cash premium made available if the securities holder consents or participates to an event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmIncentivePremium, com.tools20022.repository.entity.Distribution.mmIncentivePremium);
				derivationElement_lazy = () -> Arrays.asList(IncentivePremium3.mmType);
				element_lazy = () -> Arrays.asList(IncentivePremium.mmPerSecurity, IncentivePremium.mmPerVote, IncentivePremium.mmPerAttendee, IncentivePremium.mmDescription, IncentivePremium.mmPremiumAmount,
						IncentivePremium.mmPaymentDate, IncentivePremium.mmMeeting, IncentivePremium.mmCorporateActionDistribution);
				derivationComponent_lazy = () -> Arrays.asList(IncentivePremium1.mmObject(), IncentivePremium2.mmObject(), IncentivePremium3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Number getPerSecurity() {
		return perSecurity;
	}

	public void setPerSecurity(Number perSecurity) {
		this.perSecurity = perSecurity;
	}

	public Number getPerVote() {
		return perVote;
	}

	public void setPerVote(Number perVote) {
		this.perVote = perVote;
	}

	public YesNoIndicator getPerAttendee() {
		return perAttendee;
	}

	public void setPerAttendee(YesNoIndicator perAttendee) {
		this.perAttendee = perAttendee;
	}

	public Max350Text getDescription() {
		return description;
	}

	public void setDescription(Max350Text description) {
		this.description = description;
	}

	public CurrencyAndAmount getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(CurrencyAndAmount premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public ISODateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(ISODateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
	}

	public Distribution getCorporateActionDistribution() {
		return corporateActionDistribution;
	}

	public void setCorporateActionDistribution(com.tools20022.repository.entity.Distribution corporateActionDistribution) {
		this.corporateActionDistribution = corporateActionDistribution;
	}
}