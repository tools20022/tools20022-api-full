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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Services which consists in notifying the investor or its agent of a corporate
 * event and calculating its proceeds based on its holdings.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionServicing"
 * src="doc-files/CorporateActionServicing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.FinancialService
 * FinancialService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
 * CorporateActionServicing.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEventNotification
 * CorporateActionServicing.mmCorporateActionEventNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
 * CorporateActionServicing.mmCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionOptionServicing
 * CorporateActionServicing.mmCorporateActionOptionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmEvent
 * CorporateActionServicing.mmEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionElection
 * CorporateActionServicing.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEntitlement
 * CorporateActionServicing.mmCorporateActionEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmCorporateActionServicing
 * SecuritiesAccount.mmCorporateActionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmRelatedServicing
 * CorporateActionNotification.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmServices
 * CorporateActionEvent.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmRelatedServicing
 * CorporateActionEntitlement.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmRelatedServicing
 * CorporateActionElection.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmRelatedServicing
 * CorporateActionDistribution.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedServicing
 * CorporateActionOptionServicing.mmRelatedServicing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingServicing
 * MeetingServicing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionServicing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services which consists in notifying the investor or its agent of a corporate event and calculating its proceeds based on its holdings."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CorporateActionServicing extends FinancialService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmCorporateActionServicing
	 * SecuritiesAccount.mmCorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmSafekeepingAccount
	 * CorporateActionOption9.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmSafekeepingAccount
	 * CorporateActionOption18.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmSafekeepingAccount
	 * CorporateActionOption22.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmSafekeepingAccount
	 * CorporateActionOption27.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmSafekeepingAccount
	 * CorporateActionOption26.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmSafekeepingAccount
	 * CorporateActionOption41.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmSafekeepingAccount
	 * CorporateActionOption50.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmSafekeepingAccount
	 * CorporateActionOption29.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction1#mmAccountDetails
	 * Instruction1.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction2#mmAccountDetails
	 * Instruction2.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmAccountDetails
	 * CorporateActionElection3.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmSafekeepingAccount
	 * CorporateActionOption8.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instruction3#mmAccountDetails
	 * Instruction3.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmSafekeepingAccount
	 * CorporateActionOption116.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmSafekeepingAccount
	 * CorporateActionOption121.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmSafekeepingAccount
	 * CorporateActionOption141.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144#mmSafekeepingAccount
	 * CorporateActionOption144.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account on which the entitlement is calculated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionServicing, List<SecuritiesAccount>> mmSecuritiesAccount = new MMBusinessAssociationEnd<CorporateActionServicing, List<SecuritiesAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption9.mmSafekeepingAccount, CorporateActionOption18.mmSafekeepingAccount, CorporateActionOption22.mmSafekeepingAccount, CorporateActionOption27.mmSafekeepingAccount,
					CorporateActionOption26.mmSafekeepingAccount, CorporateActionOption41.mmSafekeepingAccount, CorporateActionOption50.mmSafekeepingAccount, CorporateActionOption29.mmSafekeepingAccount, Instruction1.mmAccountDetails,
					Instruction2.mmAccountDetails, CorporateActionElection3.mmAccountDetails, CorporateActionOption8.mmSafekeepingAccount, Instruction3.mmAccountDetails, CorporateActionOption116.mmSafekeepingAccount,
					CorporateActionOption121.mmSafekeepingAccount, CorporateActionOption141.mmSafekeepingAccount, CorporateActionOption144.mmSafekeepingAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the entitlement is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmCorporateActionServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}

		@Override
		public List<SecuritiesAccount> getValue(CorporateActionServicing obj) {
			return obj.getSecuritiesAccount();
		}

		@Override
		public void setValue(CorporateActionServicing obj, List<SecuritiesAccount> value) {
			obj.setSecuritiesAccount(value);
		}
	};
	protected List<CorporateActionNotification> corporateActionEventNotification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
	 * CorporateActionNotification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmRelatedServicing
	 * CorporateActionNotification.mmRelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#mmLastNotificationIdentification
	 * EventInformation1.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#mmLastNotificationIdentification
	 * EventInformation2.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#mmLastNotificationIdentification
	 * EventInformation3.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#mmLastNotificationIdentification
	 * EventInformation4.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#mmLastNotificationIdentification
	 * EventInformation5.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#mmLastNotificationIdentification
	 * EventInformation6.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#mmLastNotificationIdentification
	 * EventInformation7.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#mmLastNotificationIdentification
	 * EventInformation8.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmLastNotificationIdentification
	 * EventInformation9.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#mmLastNotificationIdentification
	 * EventInformation10.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmLastNotificationIdentification
	 * EventInformation11.mmLastNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation12#mmLastNotificationIdentification
	 * EventInformation12.mmLastNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in notifying the investor or its agent of a corporate event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionNotification>> mmCorporateActionEventNotification = new MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionNotification>>() {
		{
			derivation_lazy = () -> Arrays.asList(EventInformation1.mmLastNotificationIdentification, EventInformation2.mmLastNotificationIdentification, EventInformation3.mmLastNotificationIdentification,
					EventInformation4.mmLastNotificationIdentification, EventInformation5.mmLastNotificationIdentification, EventInformation6.mmLastNotificationIdentification, EventInformation7.mmLastNotificationIdentification,
					EventInformation8.mmLastNotificationIdentification, EventInformation9.mmLastNotificationIdentification, EventInformation10.mmLastNotificationIdentification, EventInformation11.mmLastNotificationIdentification,
					EventInformation12.mmLastNotificationIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventNotification";
			definition = "Service which consists in notifying the investor or its agent of a corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionNotification.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionNotification.mmObject();
		}

		@Override
		public List<CorporateActionNotification> getValue(CorporateActionServicing obj) {
			return obj.getCorporateActionEventNotification();
		}

		@Override
		public void setValue(CorporateActionServicing obj, List<CorporateActionNotification> value) {
			obj.setCorporateActionEventNotification(value);
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionDistribution> corporateActionDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmRelatedServicing
	 * CorporateActionDistribution.mmRelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmDistributionType
	 * CorporateAction3.mmDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmDistributionType
	 * CorporateAction4.mmDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmDistributionType
	 * CorporateAction5.mmDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmDistributionType
	 * CorporateAction6.mmDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmPaymentOccurrenceType
	 * CorporateAction7.mmPaymentOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmPaymentOccurrenceType
	 * CorporateAction8.mmPaymentOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmPaymentOccurrenceType
	 * CorporateAction10.mmPaymentOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmPaymentOccurrenceType
	 * CorporateAction11.mmPaymentOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDistributionType
	 * CorporateAction2.mmDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmOccurrenceType
	 * CorporateAction12.mmOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmOccurrenceType
	 * CorporateAction17.mmOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmOccurrenceType
	 * CorporateAction31.mmOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmOccurrenceType
	 * CorporateAction40.mmOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmOccurrenceType
	 * CorporateAction41.mmOccurrenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmOccurrenceType
	 * CorporateAction51.mmOccurrenceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of cash or securities as a result of a corporate action election."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionDistribution>> mmCorporateActionDistribution = new MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionDistribution>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction3.mmDistributionType, CorporateAction4.mmDistributionType, CorporateAction5.mmDistributionType, CorporateAction6.mmDistributionType, CorporateAction7.mmPaymentOccurrenceType,
					CorporateAction8.mmPaymentOccurrenceType, CorporateAction10.mmPaymentOccurrenceType, CorporateAction11.mmPaymentOccurrenceType, CorporateAction2.mmDistributionType, CorporateAction12.mmOccurrenceType,
					CorporateAction17.mmOccurrenceType, CorporateAction31.mmOccurrenceType, CorporateAction40.mmOccurrenceType, CorporateAction41.mmOccurrenceType, CorporateAction51.mmOccurrenceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Distribution of cash or securities as a result of a corporate action election.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}

		@Override
		public List<CorporateActionDistribution> getValue(CorporateActionServicing obj) {
			return obj.getCorporateActionDistribution();
		}

		@Override
		public void setValue(CorporateActionServicing obj, List<CorporateActionDistribution> value) {
			obj.setCorporateActionDistribution(value);
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionOptionServicing> corporateActionOptionServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing
	 * CorporateActionOptionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedServicing
	 * CorporateActionOptionServicing.mmRelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in notifying the investor or its entitlement per option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionOptionServicing>> mmCorporateActionOptionServicing = new MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionOptionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Service which consists in notifying the investor or its entitlement per option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
		}

		@Override
		public List<CorporateActionOptionServicing> getValue(CorporateActionServicing obj) {
			return obj.getCorporateActionOptionServicing();
		}

		@Override
		public void setValue(CorporateActionServicing obj, List<CorporateActionOptionServicing> value) {
			obj.setCorporateActionOptionServicing(value);
		}
	};
	protected List<CorporateActionEvent> event;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmServices
	 * CorporateActionEvent.mmServices}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationAdvice1#mmCorporateActionDetails
	 * CorporateActionNotificationAdvice1.mmCorporateActionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the event which is at the origin of the action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionEvent>> mmEvent = new MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionEvent>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotificationAdvice1.mmCorporateActionDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specifies the event which is at the origin of the action.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public List<CorporateActionEvent> getValue(CorporateActionServicing obj) {
			return obj.getEvent();
		}

		@Override
		public void setValue(CorporateActionServicing obj, List<CorporateActionEvent> value) {
			obj.setEvent(value);
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionElection> corporateActionElection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmRelatedServicing
	 * CorporateActionElection.mmRelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service which consists in validating, calculating and transferring the investor's instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionElection>> mmCorporateActionElection = new MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionElection>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Service which consists in validating, calculating and transferring the investor's instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}

		@Override
		public List<CorporateActionElection> getValue(CorporateActionServicing obj) {
			return obj.getCorporateActionElection();
		}

		@Override
		public void setValue(CorporateActionServicing obj, List<CorporateActionElection> value) {
			obj.setCorporateActionElection(value);
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionEntitlement> corporateActionEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmRelatedServicing
	 * CorporateActionEntitlement.mmRelatedServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the proceeds based on the balance in the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionEntitlement>> mmCorporateActionEntitlement = new MMBusinessAssociationEnd<CorporateActionServicing, List<CorporateActionEntitlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Calculation of the proceeds based on the balance in the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmRelatedServicing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}

		@Override
		public List<CorporateActionEntitlement> getValue(CorporateActionServicing obj) {
			return obj.getCorporateActionEntitlement();
		}

		@Override
		public void setValue(CorporateActionServicing obj, List<CorporateActionEntitlement> value) {
			obj.setCorporateActionEntitlement(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionServicing";
				definition = "Services which consists in notifying the investor or its agent of a corporate event and calculating its proceeds based on its holdings.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.mmCorporateActionServicing, CorporateActionNotification.mmRelatedServicing, CorporateActionEvent.mmServices,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmRelatedServicing, com.tools20022.repository.entity.CorporateActionElection.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionDistribution.mmRelatedServicing, com.tools20022.repository.entity.CorporateActionOptionServicing.mmRelatedServicing);
				subType_lazy = () -> Arrays.asList(MeetingServicing.mmObject());
				superType_lazy = () -> FinancialService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionServicing.mmSecuritiesAccount, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEventNotification,
						com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionDistribution, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionServicing.mmEvent, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionElection,
						com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEntitlement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionServicing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesAccount> getSecuritiesAccount() {
		return securitiesAccount == null ? securitiesAccount = new ArrayList<>() : securitiesAccount;
	}

	public CorporateActionServicing setSecuritiesAccount(List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount) {
		this.securitiesAccount = Objects.requireNonNull(securitiesAccount);
		return this;
	}

	public List<CorporateActionNotification> getCorporateActionEventNotification() {
		return corporateActionEventNotification == null ? corporateActionEventNotification = new ArrayList<>() : corporateActionEventNotification;
	}

	public CorporateActionServicing setCorporateActionEventNotification(List<CorporateActionNotification> corporateActionEventNotification) {
		this.corporateActionEventNotification = Objects.requireNonNull(corporateActionEventNotification);
		return this;
	}

	public List<CorporateActionDistribution> getCorporateActionDistribution() {
		return corporateActionDistribution == null ? corporateActionDistribution = new ArrayList<>() : corporateActionDistribution;
	}

	public CorporateActionServicing setCorporateActionDistribution(List<com.tools20022.repository.entity.CorporateActionDistribution> corporateActionDistribution) {
		this.corporateActionDistribution = Objects.requireNonNull(corporateActionDistribution);
		return this;
	}

	public List<CorporateActionOptionServicing> getCorporateActionOptionServicing() {
		return corporateActionOptionServicing == null ? corporateActionOptionServicing = new ArrayList<>() : corporateActionOptionServicing;
	}

	public CorporateActionServicing setCorporateActionOptionServicing(List<com.tools20022.repository.entity.CorporateActionOptionServicing> corporateActionOptionServicing) {
		this.corporateActionOptionServicing = Objects.requireNonNull(corporateActionOptionServicing);
		return this;
	}

	public List<CorporateActionEvent> getEvent() {
		return event == null ? event = new ArrayList<>() : event;
	}

	public CorporateActionServicing setEvent(List<CorporateActionEvent> event) {
		this.event = Objects.requireNonNull(event);
		return this;
	}

	public List<CorporateActionElection> getCorporateActionElection() {
		return corporateActionElection == null ? corporateActionElection = new ArrayList<>() : corporateActionElection;
	}

	public CorporateActionServicing setCorporateActionElection(List<com.tools20022.repository.entity.CorporateActionElection> corporateActionElection) {
		this.corporateActionElection = Objects.requireNonNull(corporateActionElection);
		return this;
	}

	public List<CorporateActionEntitlement> getCorporateActionEntitlement() {
		return corporateActionEntitlement == null ? corporateActionEntitlement = new ArrayList<>() : corporateActionEntitlement;
	}

	public CorporateActionServicing setCorporateActionEntitlement(List<com.tools20022.repository.entity.CorporateActionEntitlement> corporateActionEntitlement) {
		this.corporateActionEntitlement = Objects.requireNonNull(corporateActionEntitlement);
		return this;
	}
}