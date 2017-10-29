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
import com.tools20022.repository.choice.CRSSource1Choice;
import com.tools20022.repository.choice.FATCASource1Choice;
import com.tools20022.repository.choice.FATCAStatus1Choice;
import com.tools20022.repository.choice.FATCAStatus2Choice;
import com.tools20022.repository.codeset.FATCASourceStatusCode;
import com.tools20022.repository.codeset.FATCAStatusCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.msg.FATCAStatus1;
import com.tools20022.repository.msg.FATCAStatus2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Foreign Account Tax Compliance Act (FATCA) status and the status source of
 * the investor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FATCAStatus" src="doc-files/FATCAStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FATCAStatus#FATCAStatus
 * FATCAStatus.FATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#FATCASourceStatus
 * FATCAStatus.FATCASourceStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#InvestmentAccountParty
 * FATCAStatus.InvestmentAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#FATCAReportingDate
 * FATCAStatus.FATCAReportingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#FATCAStatus
 * InvestmentAccountPartyRole.FATCAStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus1 FATCAStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FATCASource1Choice
 * FATCASource1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FATCAStatus1Choice
 * FATCAStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus2 FATCAStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FATCAStatus2Choice
 * FATCAStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CRSSource1Choice
 * CRSSource1Choice}</li>
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
 * "FATCAStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Foreign Account Tax Compliance Act (FATCA) status and the status source of the investor."
 * </li>
 * </ul>
 */
public class FATCAStatus {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus1#Type
	 * FATCAStatus1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.FATCAStatus1Choice#Code
	 * FATCAStatus1Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus2#Type
	 * FATCAStatus2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.FATCAStatus2Choice#Code
	 * FATCAStatus2Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FATCAStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FATCAStatus1.Type, com.tools20022.repository.choice.FATCAStatus1Choice.Code, com.tools20022.repository.msg.FATCAStatus2.Type,
					com.tools20022.repository.choice.FATCAStatus2Choice.Code);
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FATCAStatusCode.mmObject();
		}
	};
	/**
	 * Source of the Foreign Account Tax Compliance Act (FATCA) status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatusCode
	 * FATCASourceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus1#Source
	 * FATCAStatus1.Source}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.FATCASource1Choice#Code
	 * FATCASource1Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus2#Source
	 * FATCAStatus2.Source}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CRSSource1Choice#Code
	 * CRSSource1Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCASourceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of the Foreign Account Tax Compliance Act (FATCA) status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FATCASourceStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FATCAStatus1.Source, com.tools20022.repository.choice.FATCASource1Choice.Code, com.tools20022.repository.msg.FATCAStatus2.Source,
					com.tools20022.repository.choice.CRSSource1Choice.Code);
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCASourceStatus";
			definition = "Source of the Foreign Account Tax Compliance Act (FATCA) status.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FATCASourceStatusCode.mmObject();
		}
	};
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status linked to an investment
	 * account and played by a party in that context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#FATCAStatus
	 * InvestmentAccountPartyRole.FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status linked to an investment account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountParty";
			definition = "Foreign Account Tax Compliance Act (FATCA) status linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> InvestmentAccountPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.FATCAStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date provided by the account owner to inform the account servicer of the
	 * date on which the holdings must be reported before the account is
	 * subsequently closed.
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
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#FATCAReportingDate
	 * AccountManagementStatusAndReason5.FATCAReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#FATCAReportingDate
	 * InvestmentAccountOwnershipInformation15.FATCAReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#FATCAReportingDate
	 * InvestmentAccountOwnershipInformation14.FATCAReportingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FATCAReportingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason5.FATCAReportingDate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.FATCAReportingDate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.FATCAReportingDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FATCAStatus";
				definition = "Foreign Account Tax Compliance Act (FATCA) status and the status source of the investor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.FATCAStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FATCAStatus.FATCAStatus, com.tools20022.repository.entity.FATCAStatus.FATCASourceStatus,
						com.tools20022.repository.entity.FATCAStatus.InvestmentAccountParty, com.tools20022.repository.entity.FATCAStatus.FATCAReportingDate);
				derivationComponent_lazy = () -> Arrays.asList(FATCAStatus1.mmObject(), FATCASource1Choice.mmObject(), FATCAStatus1Choice.mmObject(), FATCAStatus2.mmObject(), FATCAStatus2Choice.mmObject(), CRSSource1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}