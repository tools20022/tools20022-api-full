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
import com.tools20022.repository.choice.StatementFrequencyReason1Choice;
import com.tools20022.repository.choice.StatementFrequencyReason2Choice;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.entity.InvestmentAccountService;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Specifies the reporting parameters that are included in the account contract
 * which specifies the services linked to the account..
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReportingService" src="doc-files/ReportingService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
 * ReportingService.mmStatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmFloorNotificationAmount
 * ReportingService.mmFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmCeilingNotificationAmount
 * ReportingService.mmCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmReportingChannel
 * ReportingService.mmReportingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmRelatedInvestmentAccountService
 * ReportingService.mmRelatedInvestmentAccountService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedReportingService
 * ContactPoint.mmRelatedReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReportingService
 * InvestmentAccountService.mmReportingService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndFormModification1#mmStatementFrequencyAndForm
 * StatementFrequencyAndFormModification1.mmStatementFrequencyAndForm}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatementFrequencyReason1Choice
 * StatementFrequencyReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
 * StatementFrequencyAndForm1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndFormModification1
 * StatementFrequencyAndFormModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest1
 * ReportingRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest2
 * ReportingRequest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest3
 * ReportingRequest3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatementFrequencyReason2Choice
 * StatementFrequencyReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest4
 * ReportingRequest4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportingService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account.."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class ReportingService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected FrequencyCode statementFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmFrequency
	 * StatementDetails.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmFrequency
	 * StatementAndFinancialInstrumentDetails.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmStatementFrequency
	 * InvestmentAccount17.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmExtendedStatementFrequency
	 * InvestmentAccount17.mmExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmStatementFrequency
	 * InvestmentAccount27.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmExtendedStatementFrequency
	 * InvestmentAccount27.mmExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmStatementFrequency
	 * InvestmentAccount35.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmStatementFrequency
	 * InvestmentAccount18.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedStatementFrequency
	 * InvestmentAccount18.mmExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmStatementFrequency
	 * InvestmentAccount28.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmExtendedStatementFrequency
	 * InvestmentAccount28.mmExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmStatementFrequency
	 * InvestmentAccount36.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmStatementFrequency
	 * InvestmentAccount16.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmExtendedStatementFrequency
	 * InvestmentAccount16.mmExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmStatementFrequency
	 * InvestmentAccount26.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmExtendedStatementFrequency
	 * InvestmentAccount26.mmExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmStatementFrequency
	 * InvestmentAccount34.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmStatementCycle
	 * CustomerAccount1.mmStatementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmFrequency
	 * StatementFrequencyAndForm1.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmStatementFrequencyAndFormat
	 * CustomerAccount5.mmStatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmStatementFrequencyAndFormat
	 * CustomerAccountModification1.mmStatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmStatementFrequencyAndFormat
	 * CustomerAccount4.mmStatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmFrequency
	 * StatementAttributes1.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmStatementCycle
	 * CustomerAccount2.mmStatementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmStatementCycle
	 * CustomerAccount3.mmStatementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmStatementFrequency
	 * InvestmentAccount38.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmStatementFrequency
	 * InvestmentAccount37.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmStatementFrequency
	 * InvestmentAccount39.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmStatementFrequency
	 * InvestmentAccount46.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmStatementFrequency
	 * InvestmentAccount47.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmStatementFrequency
	 * InvestmentAccount49.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmStatementFrequency
	 * InvestmentAccount51.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmStatementFrequency
	 * InvestmentAccount50.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmStatementFrequencyAndFormat
	 * CustomerAccount7.mmStatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmStatementFrequencyAndFormat
	 * CustomerAccount6.mmStatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmStatementFrequency
	 * InvestmentAccount61.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmStatementFrequency
	 * InvestmentAccount63.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmStatementFrequency
	 * InvestmentAccount62.mmStatementFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency at which a statement must be created by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ReportingService, FrequencyCode> mmStatementFrequency = new MMBusinessAttribute<ReportingService, FrequencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(StatementDetails.mmFrequency, StatementAndFinancialInstrumentDetails.mmFrequency, InvestmentAccount17.mmStatementFrequency, InvestmentAccount17.mmExtendedStatementFrequency,
					InvestmentAccount27.mmStatementFrequency, InvestmentAccount27.mmExtendedStatementFrequency, InvestmentAccount35.mmStatementFrequency, InvestmentAccount18.mmStatementFrequency,
					InvestmentAccount18.mmExtendedStatementFrequency, InvestmentAccount28.mmStatementFrequency, InvestmentAccount28.mmExtendedStatementFrequency, InvestmentAccount36.mmStatementFrequency,
					InvestmentAccount16.mmStatementFrequency, InvestmentAccount16.mmExtendedStatementFrequency, InvestmentAccount26.mmStatementFrequency, InvestmentAccount26.mmExtendedStatementFrequency,
					InvestmentAccount34.mmStatementFrequency, CustomerAccount1.mmStatementCycle, StatementFrequencyAndForm1.mmFrequency, CustomerAccount5.mmStatementFrequencyAndFormat,
					CustomerAccountModification1.mmStatementFrequencyAndFormat, CustomerAccount4.mmStatementFrequencyAndFormat, StatementAttributes1.mmFrequency, CustomerAccount2.mmStatementCycle, CustomerAccount3.mmStatementCycle,
					InvestmentAccount38.mmStatementFrequency, InvestmentAccount37.mmStatementFrequency, InvestmentAccount39.mmStatementFrequency, InvestmentAccount46.mmStatementFrequency, InvestmentAccount47.mmStatementFrequency,
					InvestmentAccount49.mmStatementFrequency, InvestmentAccount51.mmStatementFrequency, InvestmentAccount50.mmStatementFrequency, CustomerAccount7.mmStatementFrequencyAndFormat,
					CustomerAccount6.mmStatementFrequencyAndFormat, InvestmentAccount61.mmStatementFrequency, InvestmentAccount63.mmStatementFrequency, InvestmentAccount62.mmStatementFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatementFrequency";
			definition = "Specifies the frequency at which a statement must be created by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(ReportingService obj) {
			return obj.getStatementFrequency();
		}

		@Override
		public void setValue(ReportingService obj, FrequencyCode value) {
			obj.setStatementFrequency(value);
		}
	};
	protected CurrencyAndAmount floorNotificationAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmFloorNotificationAmount
	 * CustomerAccount1.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmFloorNotificationAmount
	 * CustomerAccount5.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmFloorNotificationAmount
	 * CustomerAccountModification1.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmFloorNotificationAmount
	 * CustomerAccount4.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumFloorNotificationAmount
	 * CustomerAccount2.mmMinimumFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumFloorNotificationAmount
	 * CustomerAccount2.mmMaximumFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmFloorNotificationAmount
	 * CustomerAccount3.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumFloorNotificationAmount
	 * CustomerAccount7.mmMinimumFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumFloorNotificationAmount
	 * CustomerAccount7.mmMaximumFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmFloorNotificationAmount
	 * CustomerAccount6.mmFloorNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ReportingService, CurrencyAndAmount> mmFloorNotificationAmount = new MMBusinessAttribute<ReportingService, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount1.mmFloorNotificationAmount, CustomerAccount5.mmFloorNotificationAmount, CustomerAccountModification1.mmFloorNotificationAmount, CustomerAccount4.mmFloorNotificationAmount,
					CustomerAccount2.mmMinimumFloorNotificationAmount, CustomerAccount2.mmMaximumFloorNotificationAmount, CustomerAccount3.mmFloorNotificationAmount, CustomerAccount7.mmMinimumFloorNotificationAmount,
					CustomerAccount7.mmMaximumFloorNotificationAmount, CustomerAccount6.mmFloorNotificationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ReportingService obj) {
			return obj.getFloorNotificationAmount();
		}

		@Override
		public void setValue(ReportingService obj, CurrencyAndAmount value) {
			obj.setFloorNotificationAmount(value);
		}
	};
	protected CurrencyAndAmount ceilingNotificationAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmCeilingNotificationAmount
	 * CustomerAccount1.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmCeilingNotificationAmount
	 * CustomerAccount5.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmCeilingNotificationAmount
	 * CustomerAccountModification1.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmCeilingNotificationAmount
	 * CustomerAccount4.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumCeilingNotificationAmount
	 * CustomerAccount2.mmMinimumCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumCeilingNotificationAmount
	 * CustomerAccount2.mmMaximumCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmCeilingNotificationAmount
	 * CustomerAccount3.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumCeilingNotificationAmount
	 * CustomerAccount7.mmMinimumCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumCeilingNotificationAmount
	 * CustomerAccount7.mmMaximumCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmCeilingNotificationAmount
	 * CustomerAccount6.mmCeilingNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ReportingService, CurrencyAndAmount> mmCeilingNotificationAmount = new MMBusinessAttribute<ReportingService, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount1.mmCeilingNotificationAmount, CustomerAccount5.mmCeilingNotificationAmount, CustomerAccountModification1.mmCeilingNotificationAmount,
					CustomerAccount4.mmCeilingNotificationAmount, CustomerAccount2.mmMinimumCeilingNotificationAmount, CustomerAccount2.mmMaximumCeilingNotificationAmount, CustomerAccount3.mmCeilingNotificationAmount,
					CustomerAccount7.mmMinimumCeilingNotificationAmount, CustomerAccount7.mmMaximumCeilingNotificationAmount, CustomerAccount6.mmCeilingNotificationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ReportingService obj) {
			return obj.getCeilingNotificationAmount();
		}

		@Override
		public void setValue(ReportingService obj, CurrencyAndAmount value) {
			obj.setCeilingNotificationAmount(value);
		}
	};
	protected List<ContactPoint> reportingChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedReportingService
	 * ContactPoint.mmRelatedReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmCommunicationMethod
	 * StatementFrequencyAndForm1.mmCommunicationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the channel through which the statement must be made available to the account owner or to the information recipient."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ReportingService, List<ContactPoint>> mmReportingChannel = new MMBusinessAssociationEnd<ReportingService, List<ContactPoint>>() {
		{
			derivation_lazy = () -> Arrays.asList(StatementFrequencyAndForm1.mmCommunicationMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingChannel";
			definition = "Specifies the channel through which the statement must be made available to the account owner or to the information recipient.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmRelatedReportingService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(ReportingService obj) {
			return obj.getReportingChannel();
		}

		@Override
		public void setValue(ReportingService obj, List<ContactPoint> value) {
			obj.setReportingChannel(value);
		}
	};
	protected InvestmentAccountService relatedInvestmentAccountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReportingService
	 * InvestmentAccountService.mmReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account services which include reporting services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ReportingService, InvestmentAccountService> mmRelatedInvestmentAccountService = new MMBusinessAssociationEnd<ReportingService, InvestmentAccountService>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccountService";
			definition = "Investment account services which include reporting services.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentAccountService.mmReportingService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccountService.mmObject();
		}

		@Override
		public InvestmentAccountService getValue(ReportingService obj) {
			return obj.getRelatedInvestmentAccountService();
		}

		@Override
		public void setValue(ReportingService obj, InvestmentAccountService value) {
			obj.setRelatedInvestmentAccountService(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingService";
				definition = "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account..";
				associationDomain_lazy = () -> Arrays.asList(ContactPoint.mmRelatedReportingService, InvestmentAccountService.mmReportingService);
				derivationElement_lazy = () -> Arrays.asList(StatementFrequencyAndFormModification1.mmStatementFrequencyAndForm);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.mmStatementFrequency, com.tools20022.repository.entity.ReportingService.mmFloorNotificationAmount,
						com.tools20022.repository.entity.ReportingService.mmCeilingNotificationAmount, com.tools20022.repository.entity.ReportingService.mmReportingChannel,
						com.tools20022.repository.entity.ReportingService.mmRelatedInvestmentAccountService);
				derivationComponent_lazy = () -> Arrays.asList(StatementFrequencyReason1Choice.mmObject(), StatementFrequencyAndForm1.mmObject(), StatementFrequencyAndFormModification1.mmObject(), ReportingRequest1.mmObject(),
						ReportingRequest2.mmObject(), ReportingRequest3.mmObject(), StatementFrequencyReason2Choice.mmObject(), ReportingRequest4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReportingService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public FrequencyCode getStatementFrequency() {
		return statementFrequency;
	}

	public ReportingService setStatementFrequency(FrequencyCode statementFrequency) {
		this.statementFrequency = Objects.requireNonNull(statementFrequency);
		return this;
	}

	public CurrencyAndAmount getFloorNotificationAmount() {
		return floorNotificationAmount;
	}

	public ReportingService setFloorNotificationAmount(CurrencyAndAmount floorNotificationAmount) {
		this.floorNotificationAmount = Objects.requireNonNull(floorNotificationAmount);
		return this;
	}

	public CurrencyAndAmount getCeilingNotificationAmount() {
		return ceilingNotificationAmount;
	}

	public ReportingService setCeilingNotificationAmount(CurrencyAndAmount ceilingNotificationAmount) {
		this.ceilingNotificationAmount = Objects.requireNonNull(ceilingNotificationAmount);
		return this;
	}

	public List<ContactPoint> getReportingChannel() {
		return reportingChannel == null ? reportingChannel = new ArrayList<>() : reportingChannel;
	}

	public ReportingService setReportingChannel(List<ContactPoint> reportingChannel) {
		this.reportingChannel = Objects.requireNonNull(reportingChannel);
		return this;
	}

	public InvestmentAccountService getRelatedInvestmentAccountService() {
		return relatedInvestmentAccountService;
	}

	public ReportingService setRelatedInvestmentAccountService(InvestmentAccountService relatedInvestmentAccountService) {
		this.relatedInvestmentAccountService = Objects.requireNonNull(relatedInvestmentAccountService);
		return this;
	}
}