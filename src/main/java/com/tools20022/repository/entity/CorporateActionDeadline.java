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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.msg.BorrowerLendingDeadline1;
import com.tools20022.repository.msg.BorrowerLendingDeadline2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Time constraints for processing corporate actions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionDeadline"
 * src="doc-files/CorporateActionDeadline.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#RevocabilityPeriod
 * CorporateActionDeadline.RevocabilityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ProtectDate
 * CorporateActionDeadline.ProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#TradingSuspendedDate
 * CorporateActionDeadline.TradingSuspendedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ThirdPartyDeadline
 * CorporateActionDeadline.ThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#CertificationDeadline
 * CorporateActionDeadline.CertificationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#DeadlineToSplit
 * CorporateActionDeadline.DeadlineToSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#SpecialExDate
 * CorporateActionDeadline.SpecialExDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#DeadlineForTaxBreakdownInstruction
 * CorporateActionDeadline.DeadlineForTaxBreakdownInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#EarlyClosingDate
 * CorporateActionDeadline.EarlyClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#RecordDate
 * CorporateActionDeadline.RecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#CoverExpirationDate
 * CorporateActionDeadline.CoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ElectionToCounterpartyDeadline
 * CorporateActionDeadline.ElectionToCounterpartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ExpiryDate
 * CorporateActionDeadline.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#EarlyThirdPartyDeadline
 * CorporateActionDeadline.EarlyThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#DepositoryCoverExpirationDate
 * CorporateActionDeadline.DepositoryCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ResponseDeadline
 * CorporateActionDeadline.ResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ConsentExpirationDate
 * CorporateActionDeadline.ConsentExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#RegistrationDeadline
 * CorporateActionDeadline.RegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#StockLendingDeadline
 * CorporateActionDeadline.StockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#ConsentRecordDate
 * CorporateActionDeadline.ConsentRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#EarlyResponseDeadline
 * CorporateActionDeadline.EarlyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#GuaranteedParticipationDate
 * CorporateActionDeadline.GuaranteedParticipationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline1
 * BorrowerLendingDeadline1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline2
 * BorrowerLendingDeadline2}</li>
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
 * "CorporateActionDeadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Time constraints for processing corporate actions."</li>
 * </ul>
 */
public class CorporateActionDeadline extends Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period during which the shareholder can revoke, change or withdraw its
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#RevocabilityPeriod
	 * CorporateActionPeriod5.RevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#AccountServicerRevocabilityPeriod
	 * CorporateActionPeriod5.AccountServicerRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#RevocabilityPeriod
	 * CorporateActionPeriod7.RevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#AccountServicerRevocabilityPeriod
	 * CorporateActionPeriod7.AccountServicerRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#RevocabilityPeriod
	 * CorporateActionPeriod2.RevocabilityPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the shareholder can revoke, change or withdraw its instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RevocabilityPeriod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod5.RevocabilityPeriod, com.tools20022.repository.msg.CorporateActionPeriod5.AccountServicerRevocabilityPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod7.RevocabilityPeriod, com.tools20022.repository.msg.CorporateActionPeriod7.AccountServicerRevocabilityPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod2.RevocabilityPeriod);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevocabilityPeriod";
			definition = "Period during which the shareholder can revoke, change or withdraw its instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Last date a holder can request to defer delivery of securities pursuant
	 * to a notice of guaranteed delivery or other required documentation.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#ProtectDate
	 * CorporateActionDate6.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#ProtectDate
	 * CorporateActionDate10.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#ProtectDate
	 * CorporateActionDate18.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#ProtectDate
	 * CorporateActionDate19.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#ProtectDate
	 * CorporateActionDate8.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#ProtectDate
	 * CorporateActionDate11.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#ProtectDate
	 * CorporateActionDate15.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#ProtectDate
	 * CorporateActionDate16.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#ProtectDate
	 * CorporateActionDate2.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#ProtectDate
	 * CorporateActionDate29.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#ProtectDate
	 * CorporateActionDate33.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#ProtectDate
	 * CorporateActionDate46.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#ProtectDate
	 * CorporateActionDate48.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#ProtectDate
	 * CorporateActionDate52.ProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#ProtectDate
	 * CorporateActionDate55.ProtectDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProtectDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.ProtectDate, com.tools20022.repository.msg.CorporateActionDate10.ProtectDate,
					com.tools20022.repository.msg.CorporateActionDate18.ProtectDate, com.tools20022.repository.msg.CorporateActionDate19.ProtectDate, com.tools20022.repository.msg.CorporateActionDate8.ProtectDate,
					com.tools20022.repository.msg.CorporateActionDate11.ProtectDate, com.tools20022.repository.msg.CorporateActionDate15.ProtectDate, com.tools20022.repository.msg.CorporateActionDate16.ProtectDate,
					com.tools20022.repository.msg.CorporateActionDate2.ProtectDate, com.tools20022.repository.msg.CorporateActionDate29.ProtectDate, com.tools20022.repository.msg.CorporateActionDate33.ProtectDate,
					com.tools20022.repository.msg.CorporateActionDate46.ProtectDate, com.tools20022.repository.msg.CorporateActionDate48.ProtectDate, com.tools20022.repository.msg.CorporateActionDate52.ProtectDate,
					com.tools20022.repository.msg.CorporateActionDate55.ProtectDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtectDate";
			definition = "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which trading of a security is suspended as the result of an
	 * event.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#TradingSuspendedDate
	 * CorporateActionDate1.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#TradingSuspendedDate
	 * CorporateActionDate13.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#TradingSuspendedDate
	 * CorporateActionDate14.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#TradingSuspendedDate
	 * CorporateActionDate21.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#TradingSuspendedDate
	 * CorporateActionDate22.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#TradingSuspendedDate
	 * CorporateActionDate25.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#TradingSuspendedDate
	 * CorporateActionDate27.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#TradingSuspendedDate
	 * CorporateActionDate28.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#TradingSuspendedDate
	 * CorporateActionDate2.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#TradingSuspendedDate
	 * CorporateActionDate44.TradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#TradingSuspendedDate
	 * CorporateActionDate58.TradingSuspendedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which trading of a security is suspended as the result of an event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingSuspendedDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.CorporateActionDate1.TradingSuspendedDate, com.tools20022.repository.msg.CorporateActionDate13.TradingSuspendedDate,
							com.tools20022.repository.msg.CorporateActionDate14.TradingSuspendedDate, com.tools20022.repository.msg.CorporateActionDate21.TradingSuspendedDate,
							com.tools20022.repository.msg.CorporateActionDate22.TradingSuspendedDate, com.tools20022.repository.msg.CorporateActionDate25.TradingSuspendedDate,
							com.tools20022.repository.msg.CorporateActionDate27.TradingSuspendedDate, com.tools20022.repository.msg.CorporateActionDate28.TradingSuspendedDate,
							com.tools20022.repository.msg.CorporateActionDate2.TradingSuspendedDate, com.tools20022.repository.msg.CorporateActionDate44.TradingSuspendedDate,
							com.tools20022.repository.msg.CorporateActionDate58.TradingSuspendedDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date on which trading of a security is suspended as the result of an event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/Time by which the account owner must instruct directly another
	 * party, for example to provide documentation to an issuer agent.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#ThirdPartyDeadline
	 * CorporateActionDate1.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#ThirdPartyDeadline
	 * CorporateActionDate13.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#ThirdPartyDeadline
	 * CorporateActionDate14.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#ThirdPartyDeadline
	 * CorporateActionDate21.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#ThirdPartyDeadline
	 * CorporateActionDate22.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#ThirdPartyDeadline
	 * CorporateActionDate25.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#ThirdPartyDeadline
	 * CorporateActionDate27.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#ThirdPartyDeadline
	 * CorporateActionDate28.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#ThirdPartyDeadline
	 * CorporateActionDate44.ThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#ThirdPartyDeadline
	 * CorporateActionDate58.ThirdPartyDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ThirdPartyDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.ThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate13.ThirdPartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate14.ThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate21.ThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate22.ThirdPartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate25.ThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate27.ThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate28.ThirdPartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate44.ThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate58.ThirdPartyDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdPartyDeadline";
			definition = "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Deadline by which the beneficial ownership of securities must be
	 * declared.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#CertificationDeadline
	 * CorporateActionDate1.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#CertificationDeadline
	 * CorporateActionDate13.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#CertificationDeadline
	 * CorporateActionDate14.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#CertificationDeadline
	 * CorporateActionDate21.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#CertificationDeadline
	 * CorporateActionDate22.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#CertificationDeadline
	 * CorporateActionDate25.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#CertificationDeadline
	 * CorporateActionDate27.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#CertificationDeadline
	 * CorporateActionDate28.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#CertificationDeadline
	 * CorporateActionDate2.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#CertificationDeadline
	 * CorporateActionDate44.CertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#CertificationDeadline
	 * CorporateActionDate58.CertificationDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which the beneficial ownership of securities must be declared."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificationDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.CertificationDeadline, com.tools20022.repository.msg.CorporateActionDate13.CertificationDeadline,
					com.tools20022.repository.msg.CorporateActionDate14.CertificationDeadline, com.tools20022.repository.msg.CorporateActionDate21.CertificationDeadline,
					com.tools20022.repository.msg.CorporateActionDate22.CertificationDeadline, com.tools20022.repository.msg.CorporateActionDate25.CertificationDeadline,
					com.tools20022.repository.msg.CorporateActionDate27.CertificationDeadline, com.tools20022.repository.msg.CorporateActionDate28.CertificationDeadline,
					com.tools20022.repository.msg.CorporateActionDate2.CertificationDeadline, com.tools20022.repository.msg.CorporateActionDate44.CertificationDeadline,
					com.tools20022.repository.msg.CorporateActionDate58.CertificationDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the beneficial ownership of securities must be declared.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Deadline by which instructions must be received to split securities, that
	 * is, of physical certificates.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#DeadlineToSplit
	 * CorporateActionDate1.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#DeadlineToSplit
	 * CorporateActionDate13.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#DeadlineToSplit
	 * CorporateActionDate14.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#DeadlineToSplit
	 * CorporateActionDate21.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#DeadlineToSplit
	 * CorporateActionDate22.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#DeadlineToSplit
	 * CorporateActionDate25.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#DeadlineToSplit
	 * CorporateActionDate27.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#DeadlineToSplit
	 * CorporateActionDate28.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#DeadlineToSplit
	 * CorporateActionDate4.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#DeadlineToSplit
	 * CorporateActionDate44.DeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#DeadlineToSplit
	 * CorporateActionDate58.DeadlineToSplit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineToSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which instructions must be received to split securities, that is, of physical certificates."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeadlineToSplit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.DeadlineToSplit, com.tools20022.repository.msg.CorporateActionDate13.DeadlineToSplit,
					com.tools20022.repository.msg.CorporateActionDate14.DeadlineToSplit, com.tools20022.repository.msg.CorporateActionDate21.DeadlineToSplit, com.tools20022.repository.msg.CorporateActionDate22.DeadlineToSplit,
					com.tools20022.repository.msg.CorporateActionDate25.DeadlineToSplit, com.tools20022.repository.msg.CorporateActionDate27.DeadlineToSplit, com.tools20022.repository.msg.CorporateActionDate28.DeadlineToSplit,
					com.tools20022.repository.msg.CorporateActionDate4.DeadlineToSplit, com.tools20022.repository.msg.CorporateActionDate44.DeadlineToSplit, com.tools20022.repository.msg.CorporateActionDate58.DeadlineToSplit);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, that is, of physical certificates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time as from which 'special processing' can start to be used by
	 * participants for that event. Special processing is a means of marking a
	 * transaction, that would normally be traded ex or cum, as being traded cum
	 * or ex respectively, for example, a transaction dealt 'special' after the
	 * ex date would result in the buyer being eligible for the entitlement.
	 * This is typically used in the UK and Irish markets.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#SpecialExDate
	 * CorporateActionDate1.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#SpecialExDate
	 * CorporateActionDate13.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#SpecialExDate
	 * CorporateActionDate14.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#SpecialExDate
	 * CorporateActionDate21.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#SpecialExDate
	 * CorporateActionDate22.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#SpecialExDate
	 * CorporateActionDate25.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#SpecialExDate
	 * CorporateActionDate27.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#SpecialExDate
	 * CorporateActionDate28.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#SpecialExDate
	 * CorporateActionDate2.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#SpecialExDate
	 * CorporateActionDate44.SpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#SpecialExDate
	 * CorporateActionDate58.SpecialExDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SpecialExDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.SpecialExDate, com.tools20022.repository.msg.CorporateActionDate13.SpecialExDate,
					com.tools20022.repository.msg.CorporateActionDate14.SpecialExDate, com.tools20022.repository.msg.CorporateActionDate21.SpecialExDate, com.tools20022.repository.msg.CorporateActionDate22.SpecialExDate,
					com.tools20022.repository.msg.CorporateActionDate25.SpecialExDate, com.tools20022.repository.msg.CorporateActionDate27.SpecialExDate, com.tools20022.repository.msg.CorporateActionDate28.SpecialExDate,
					com.tools20022.repository.msg.CorporateActionDate2.SpecialExDate, com.tools20022.repository.msg.CorporateActionDate44.SpecialExDate, com.tools20022.repository.msg.CorporateActionDate58.SpecialExDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date until which tax breakdown instructions will be accepted.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate1.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate13.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate14.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate21.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate22.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate25.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate27.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate28.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate2.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate44.DeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#DeadlineForTaxBreakdownInstruction
	 * CorporateActionDate58.DeadlineForTaxBreakdownInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineForTaxBreakdownInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date until which tax breakdown instructions will be accepted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeadlineForTaxBreakdownInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.DeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate13.DeadlineForTaxBreakdownInstruction,
					com.tools20022.repository.msg.CorporateActionDate14.DeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate21.DeadlineForTaxBreakdownInstruction,
					com.tools20022.repository.msg.CorporateActionDate22.DeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate25.DeadlineForTaxBreakdownInstruction,
					com.tools20022.repository.msg.CorporateActionDate27.DeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate28.DeadlineForTaxBreakdownInstruction,
					com.tools20022.repository.msg.CorporateActionDate2.DeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate44.DeadlineForTaxBreakdownInstruction,
					com.tools20022.repository.msg.CorporateActionDate58.DeadlineForTaxBreakdownInstruction);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeadlineForTaxBreakdownInstruction";
			definition = "Date until which tax breakdown instructions will be accepted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * First possible early closing date of an offer if different from the
	 * expiry date.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#EarlyClosingDate
	 * CorporateActionDate1.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#EarlyClosingDate
	 * CorporateActionDate13.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#EarlyClosingDate
	 * CorporateActionDate14.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#EarlyClosingDate
	 * CorporateActionDate21.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#EarlyClosingDate
	 * CorporateActionDate22.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#EarlyClosingDate
	 * CorporateActionDate25.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#EarlyClosingDate
	 * CorporateActionDate27.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#EarlyClosingDate
	 * CorporateActionDate28.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#EarlyClosingDate
	 * CorporateActionDate2.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#EarlyClosingDate
	 * CorporateActionDate44.EarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#EarlyClosingDate
	 * CorporateActionDate58.EarlyClosingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First possible early closing date of an offer if different from the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EarlyClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.EarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate13.EarlyClosingDate,
					com.tools20022.repository.msg.CorporateActionDate14.EarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate21.EarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate22.EarlyClosingDate,
					com.tools20022.repository.msg.CorporateActionDate25.EarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate27.EarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate28.EarlyClosingDate,
					com.tools20022.repository.msg.CorporateActionDate2.EarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate44.EarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate58.EarlyClosingDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlyClosingDate";
			definition = "First possible early closing date of an offer if different from the expiry date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date at which the positions are struck to note which parties will receive
	 * the entitlement.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#RecordDate
	 * CorporateActionDate1.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#RecordDate
	 * CorporateActionDate13.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#RecordDate
	 * CorporateActionDate14.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#RecordDate
	 * CorporateActionDate21.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#RecordDate
	 * CorporateActionDate22.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#RecordDate
	 * CorporateActionDate25.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#RecordDate
	 * CorporateActionDate27.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#RecordDate
	 * CorporateActionDate28.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#RecordDate
	 * EntitlementAssessment.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates#RecordDate
	 * EligibilityDates.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#RecordDate
	 * CorporateActionDate2.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#RecordDate
	 * EntitlementAdvice1.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#RecordDate
	 * GlobalDistributionRequest1.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#RecordDate
	 * CommonFinancialInstrumentAttributes1.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate30#RecordDate
	 * CorporateActionDate30.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate34#RecordDate
	 * CorporateActionDate34.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate41#RecordDate
	 * CorporateActionDate41.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate43#RecordDate
	 * CorporateActionDate43.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate49#RecordDate
	 * CorporateActionDate49.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate45#RecordDate
	 * CorporateActionDate45.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#RecordDate
	 * CorporateActionDate44.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate54#RecordDate
	 * CorporateActionDate54.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate50#RecordDate
	 * CorporateActionDate50.RecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#RecordDate
	 * CorporateActionDate58.RecordDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the positions are struck to note which parties will receive the entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RecordDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.RecordDate, com.tools20022.repository.msg.CorporateActionDate13.RecordDate,
					com.tools20022.repository.msg.CorporateActionDate14.RecordDate, com.tools20022.repository.msg.CorporateActionDate21.RecordDate, com.tools20022.repository.msg.CorporateActionDate22.RecordDate,
					com.tools20022.repository.msg.CorporateActionDate25.RecordDate, com.tools20022.repository.msg.CorporateActionDate27.RecordDate, com.tools20022.repository.msg.CorporateActionDate28.RecordDate,
					com.tools20022.repository.msg.EntitlementAssessment.RecordDate, com.tools20022.repository.msg.EligibilityDates.RecordDate, com.tools20022.repository.msg.CorporateActionDate2.RecordDate,
					com.tools20022.repository.msg.EntitlementAdvice1.RecordDate, com.tools20022.repository.msg.GlobalDistributionRequest1.RecordDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.RecordDate,
					com.tools20022.repository.msg.CorporateActionDate30.RecordDate, com.tools20022.repository.msg.CorporateActionDate34.RecordDate, com.tools20022.repository.msg.CorporateActionDate41.RecordDate,
					com.tools20022.repository.msg.CorporateActionDate43.RecordDate, com.tools20022.repository.msg.CorporateActionDate49.RecordDate, com.tools20022.repository.msg.CorporateActionDate45.RecordDate,
					com.tools20022.repository.msg.CorporateActionDate44.RecordDate, com.tools20022.repository.msg.CorporateActionDate54.RecordDate, com.tools20022.repository.msg.CorporateActionDate50.RecordDate,
					com.tools20022.repository.msg.CorporateActionDate58.RecordDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecordDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Last day a holder can deliver the securities that it had previously
	 * protected.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#CoverExpirationDate
	 * CorporateActionDate6.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#CoverExpirationDate
	 * CorporateActionDate10.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#CoverExpirationDate
	 * CorporateActionDate18.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#CoverExpirationDate
	 * CorporateActionDate19.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#CoverExpirationDate
	 * CorporateActionDate8.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#CoverExpirationDate
	 * CorporateActionDate11.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#CoverExpirationDate
	 * CorporateActionDate15.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#CoverExpirationDate
	 * CorporateActionDate16.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#CoverExpirationDate
	 * CorporateActionDate2.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#CoverExpirationDate
	 * CorporateActionDate29.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#CoverExpirationDate
	 * CorporateActionDate33.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#CoverExpirationDate
	 * CorporateActionDate46.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#CoverExpirationDate
	 * CorporateActionDate48.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#CoverExpirationDate
	 * CorporateActionDate52.CoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#CoverExpirationDate
	 * CorporateActionDate55.CoverExpirationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day a holder can deliver the securities that it had previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CoverExpirationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate10.CoverExpirationDate,
					com.tools20022.repository.msg.CorporateActionDate18.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate19.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate8.CoverExpirationDate,
					com.tools20022.repository.msg.CorporateActionDate11.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate15.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate16.CoverExpirationDate,
					com.tools20022.repository.msg.CorporateActionDate2.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate29.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate33.CoverExpirationDate,
					com.tools20022.repository.msg.CorporateActionDate46.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate48.CoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate52.CoverExpirationDate,
					com.tools20022.repository.msg.CorporateActionDate55.CoverExpirationDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had previously protected.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Deadline by which an entitled holder needs to advise their counterparty
	 * to a transaction of their election for a corporate action event.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#ElectionToCounterpartyDeadline
	 * CorporateActionDate1.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#ElectionToCounterpartyDeadline
	 * CorporateActionDate13.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#ElectionToCounterpartyDeadline
	 * CorporateActionDate14.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#ElectionToCounterpartyDeadline
	 * CorporateActionDate21.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#ElectionToCounterpartyDeadline
	 * CorporateActionDate22.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#ElectionToCounterpartyDeadline
	 * CorporateActionDate25.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#ElectionToCounterpartyDeadline
	 * CorporateActionDate27.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#ElectionToCounterpartyDeadline
	 * CorporateActionDate28.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#ElectionToCounterpartyDeadline
	 * CorporateActionDate2.ElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#ElectionToCounterpartyMarketDeadline
	 * CorporateActionDate44.ElectionToCounterpartyMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#ElectionToCounterpartyResponseDeadline
	 * CorporateActionDate44.ElectionToCounterpartyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#ElectionToCounterpartyMarketDeadline
	 * CorporateActionDate58.ElectionToCounterpartyMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#ElectionToCounterpartyResponseDeadline
	 * CorporateActionDate58.ElectionToCounterpartyResponseDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionToCounterpartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ElectionToCounterpartyDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.ElectionToCounterpartyDeadline, com.tools20022.repository.msg.CorporateActionDate13.ElectionToCounterpartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate14.ElectionToCounterpartyDeadline, com.tools20022.repository.msg.CorporateActionDate21.ElectionToCounterpartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate22.ElectionToCounterpartyDeadline, com.tools20022.repository.msg.CorporateActionDate25.ElectionToCounterpartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate27.ElectionToCounterpartyDeadline, com.tools20022.repository.msg.CorporateActionDate28.ElectionToCounterpartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate2.ElectionToCounterpartyDeadline, com.tools20022.repository.msg.CorporateActionDate44.ElectionToCounterpartyMarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate44.ElectionToCounterpartyResponseDeadline, com.tools20022.repository.msg.CorporateActionDate58.ElectionToCounterpartyMarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate58.ElectionToCounterpartyResponseDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectionToCounterpartyDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which the offer terminates.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#ExpiryDate
	 * CorporateActionDate6.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#ExpiryDate
	 * CorporateActionDate10.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#ExpiryDate
	 * CorporateActionDate18.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#ExpiryDate
	 * CorporateActionDate19.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#ExpiryDate
	 * CorporateActionDate8.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#ExpiryDate
	 * CorporateActionDate11.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#ExpiryDate
	 * CorporateActionDate15.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#ExpiryDate
	 * CorporateActionDate16.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#ExpiryDate
	 * CorporateActionDate4.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#ExpiryDate
	 * CorporateActionDate29.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#ExpiryDate
	 * CorporateActionDate33.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#ExpiryDate
	 * CorporateActionDate46.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#ExpiryDate
	 * CorporateActionDate48.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#ExpiryDate
	 * CorporateActionDate52.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#ExpiryDate
	 * CorporateActionDate55.ExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the offer terminates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate10.ExpiryDate,
					com.tools20022.repository.msg.CorporateActionDate18.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate19.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate8.ExpiryDate,
					com.tools20022.repository.msg.CorporateActionDate11.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate15.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate16.ExpiryDate,
					com.tools20022.repository.msg.CorporateActionDate4.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate29.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate33.ExpiryDate,
					com.tools20022.repository.msg.CorporateActionDate46.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate48.ExpiryDate, com.tools20022.repository.msg.CorporateActionDate52.ExpiryDate,
					com.tools20022.repository.msg.CorporateActionDate55.ExpiryDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which the offer terminates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/Time set by the issuer agent as a first early deadline by which the
	 * account owner must instruct directly another party, possibly giving the
	 * holder eligibility to incentives. For example, to provide documentation
	 * to an issuer agent.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EarlyThirdPartyDeadline = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlyThirdPartyDeadline";
			definition = "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * The last date/tiime that a participant of the depository can deliver
	 * securities that it had elected on and/or previously protected.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#DepositoryCoverExpirationDate
	 * CorporateActionDate8.DepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#DepositoryCoverExpirationDate
	 * CorporateActionDate11.DepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#DepositoryCoverExpirationDate
	 * CorporateActionDate15.DepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#DepositoryCoverExpirationDate
	 * CorporateActionDate16.DepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#DepositoryCoverExpirationDate
	 * CorporateActionDate29.DepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#DepositoryCoverExpirationDate
	 * CorporateActionDate33.DepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#DepositoryCoverExpirationDate
	 * CorporateActionDate48.DepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#DepositoryCoverExpirationDate
	 * CorporateActionDate55.DepositoryCoverExpirationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryCoverExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The last date/tiime that a participant of the depository can deliver securities that it had elected on and/or previously protected."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DepositoryCoverExpirationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate8.DepositoryCoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate11.DepositoryCoverExpirationDate,
					com.tools20022.repository.msg.CorporateActionDate15.DepositoryCoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate16.DepositoryCoverExpirationDate,
					com.tools20022.repository.msg.CorporateActionDate29.DepositoryCoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate33.DepositoryCoverExpirationDate,
					com.tools20022.repository.msg.CorporateActionDate48.DepositoryCoverExpirationDate, com.tools20022.repository.msg.CorporateActionDate55.DepositoryCoverExpirationDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositoryCoverExpirationDate";
			definition = "The last date/tiime that a participant of the depository can deliver securities that it had elected on and/or previously protected.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which the account servicer has set as the deadline to respond,
	 * with instructions, to an outstanding event. This time is dependent on the
	 * reference time zone of the account servicer as specified in an SLA.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#ResponseDeadline
	 * CorporateActionDate6.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#ResponseDeadline
	 * CorporateActionDate10.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#ResponseDeadline
	 * CorporateActionDate18.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#ResponseDeadline
	 * CorporateActionDate19.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#ResponseDeadline
	 * CorporateActionDate8.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#ResponseDeadline
	 * CorporateActionDate11.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#ResponseDeadline
	 * CorporateActionDate15.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#ResponseDeadline
	 * CorporateActionDate16.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#ResponseDeadline
	 * CorporateActionDate4.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#ResponseDeadline
	 * CorporateActionOption11.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#ResponseDeadline
	 * CorporateActionDate29.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#ResponseDeadline
	 * CorporateActionDate33.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#ResponseDeadline
	 * CorporateActionDate46.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#ResponseDeadline
	 * CorporateActionDate48.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#ResponseDeadline
	 * CorporateActionDate52.ResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#ResponseDeadline
	 * CorporateActionDate55.ResponseDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in an SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResponseDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate10.ResponseDeadline,
					com.tools20022.repository.msg.CorporateActionDate18.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate19.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate8.ResponseDeadline,
					com.tools20022.repository.msg.CorporateActionDate11.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate15.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate16.ResponseDeadline,
					com.tools20022.repository.msg.CorporateActionDate4.ResponseDeadline, com.tools20022.repository.msg.CorporateActionOption11.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate29.ResponseDeadline,
					com.tools20022.repository.msg.CorporateActionDate33.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate46.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate48.ResponseDeadline,
					com.tools20022.repository.msg.CorporateActionDate52.ResponseDeadline, com.tools20022.repository.msg.CorporateActionDate55.ResponseDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResponseDeadline";
			definition = "Date on which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in an SLA.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Last date on which a holder can consent to the changes sought by the
	 * corporation.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#ConsentExpirationDate
	 * CorporateActionDate4.ConsentExpirationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date on which a holder can consent to the changes sought by the corporation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConsentExpirationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate4.ConsentExpirationDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentExpirationDate";
			definition = "Last date on which a holder can consent to the changes sought by the corporation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which instructions to register or registration details will be
	 * accepted.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#RegistrationDeadline
	 * CorporateActionDate1.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#RegistrationDeadline
	 * CorporateActionDate13.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#RegistrationDeadline
	 * CorporateActionDate14.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#RegistrationDeadline
	 * CorporateActionDate21.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#RegistrationDeadline
	 * CorporateActionDate22.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#RegistrationDeadline
	 * CorporateActionDate25.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#RegistrationDeadline
	 * CorporateActionDate27.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#RegistrationDeadline
	 * CorporateActionDate28.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#RegistrationDeadline
	 * CorporateActionDate2.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#RegistrationDeadline
	 * CorporateActionDate44.RegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#RegistrationDeadline
	 * CorporateActionDate58.RegistrationDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which instructions to register or registration details will be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegistrationDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.CorporateActionDate1.RegistrationDeadline, com.tools20022.repository.msg.CorporateActionDate13.RegistrationDeadline,
							com.tools20022.repository.msg.CorporateActionDate14.RegistrationDeadline, com.tools20022.repository.msg.CorporateActionDate21.RegistrationDeadline,
							com.tools20022.repository.msg.CorporateActionDate22.RegistrationDeadline, com.tools20022.repository.msg.CorporateActionDate25.RegistrationDeadline,
							com.tools20022.repository.msg.CorporateActionDate27.RegistrationDeadline, com.tools20022.repository.msg.CorporateActionDate28.RegistrationDeadline,
							com.tools20022.repository.msg.CorporateActionDate2.RegistrationDeadline, com.tools20022.repository.msg.CorporateActionDate44.RegistrationDeadline,
							com.tools20022.repository.msg.CorporateActionDate58.RegistrationDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date on which instructions to register or registration details will be accepted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date or date and time that the account servicer has set as the deadline
	 * to respond with instructions to an event for which the underlying
	 * security is out on loan.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#StockLendingDeadline
	 * CorporateActionDate29.StockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#StockLendingDeadline
	 * CorporateActionDate33.StockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#StockLendingDeadline
	 * CorporateActionDate48.StockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline1#StockLendingDeadline
	 * BorrowerLendingDeadline1.StockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#StockLendingDeadline
	 * CorporateActionDate55.StockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline2#StockLendingDeadline
	 * BorrowerLendingDeadline2.StockLendingDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLendingDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date or date and time that the account servicer has set as the deadline to respond with instructions to an event for which the underlying security is out on loan. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StockLendingDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate29.StockLendingDeadline, com.tools20022.repository.msg.CorporateActionDate33.StockLendingDeadline,
					com.tools20022.repository.msg.CorporateActionDate48.StockLendingDeadline, com.tools20022.repository.msg.BorrowerLendingDeadline1.StockLendingDeadline,
					com.tools20022.repository.msg.CorporateActionDate55.StockLendingDeadline, com.tools20022.repository.msg.BorrowerLendingDeadline2.StockLendingDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockLendingDeadline";
			definition = "Date or date and time that the account servicer has set as the deadline to respond with instructions to an event for which the underlying security is out on loan. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date used by the offeror to determine the beneficiary eligible to
	 * participate in a consent based on the registered owner of the securities,
	 * eg, beneficial owner of consent record. The consent record date qualifier
	 * is used to indicate that a record date only applies to a certain part of
	 * the offer, not the entire offer.<br>
	 * The consent record date is used to indicate that a record date only
	 * applies to a certain part of the offer, not the entire offer.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#ConsentRecordDate
	 * CorporateActionDate4.ConsentRecordDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, eg, beneficial owner of consent record. The consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.\r\nThe consent record date is used to indicate that a record date only applies to a certain part of the offer, not the entire offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConsentRecordDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate4.ConsentRecordDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentRecordDate";
			definition = "Date used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, eg, beneficial owner of consent record. The consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.\r\nThe consent record date is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time that the account servicer has set as the deadline to respond,
	 * with instructions, to an outstanding event, giving the holder eligibility
	 * to incentives. This time is dependent on the reference time zone of the
	 * account servicer as specified in an SLA.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#EarlyResponseDeadline
	 * CorporateActionDate8.EarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#EarlyResponseDeadline
	 * CorporateActionDate11.EarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#EarlyResponseDeadline
	 * CorporateActionDate15.EarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#EarlyResponseDeadline
	 * CorporateActionDate16.EarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#EarlyThirdPartyDeadline
	 * CorporateActionDate1.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#EarlyThirdPartyDeadline
	 * CorporateActionDate13.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#EarlyThirdPartyDeadline
	 * CorporateActionDate14.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#EarlyThirdPartyDeadline
	 * CorporateActionDate21.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#EarlyThirdPartyDeadline
	 * CorporateActionDate22.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#EarlyThirdPartyDeadline
	 * CorporateActionDate25.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#EarlyThirdPartyDeadline
	 * CorporateActionDate27.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#EarlyThirdPartyDeadline
	 * CorporateActionDate28.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#EarlyResponseDeadline
	 * CorporateActionDate29.EarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#EarlyResponseDeadline
	 * CorporateActionDate33.EarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#EarlyResponseDeadline
	 * CorporateActionDate48.EarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#EarlyThirdPartyDeadline
	 * CorporateActionDate44.EarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#EarlyResponseDeadline
	 * CorporateActionDate55.EarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#EarlyThirdPartyDeadline
	 * CorporateActionDate58.EarlyThirdPartyDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in an SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EarlyResponseDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate8.EarlyResponseDeadline, com.tools20022.repository.msg.CorporateActionDate11.EarlyResponseDeadline,
					com.tools20022.repository.msg.CorporateActionDate15.EarlyResponseDeadline, com.tools20022.repository.msg.CorporateActionDate16.EarlyResponseDeadline,
					com.tools20022.repository.msg.CorporateActionDate1.EarlyThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate13.EarlyThirdPartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate14.EarlyThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate21.EarlyThirdPartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate22.EarlyThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate25.EarlyThirdPartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate27.EarlyThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate28.EarlyThirdPartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate29.EarlyResponseDeadline, com.tools20022.repository.msg.CorporateActionDate33.EarlyResponseDeadline,
					com.tools20022.repository.msg.CorporateActionDate48.EarlyResponseDeadline, com.tools20022.repository.msg.CorporateActionDate44.EarlyThirdPartyDeadline,
					com.tools20022.repository.msg.CorporateActionDate55.EarlyResponseDeadline, com.tools20022.repository.msg.CorporateActionDate58.EarlyThirdPartyDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlyResponseDeadline";
			definition = "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in an SLA.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Last date/time by which a buying counterparty to a trade can be sure that
	 * it will have the right to participate in an event.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#GuaranteedParticipationDate
	 * CorporateActionDate1.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#GuaranteedParticipationDate
	 * CorporateActionDate13.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#GuaranteedParticipationDate
	 * CorporateActionDate14.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#GuaranteedParticipationDate
	 * CorporateActionDate21.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#GuaranteedParticipationDate
	 * CorporateActionDate22.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#GuaranteedParticipationDate
	 * CorporateActionDate25.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#GuaranteedParticipationDate
	 * CorporateActionDate27.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#GuaranteedParticipationDate
	 * CorporateActionDate28.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#GuaranteedParticipationDate
	 * CorporateActionDate2.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#GuaranteedParticipationDate
	 * CorporateActionDate44.GuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#GuaranteedParticipationDate
	 * CorporateActionDate58.GuaranteedParticipationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedParticipationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GuaranteedParticipationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.GuaranteedParticipationDate, com.tools20022.repository.msg.CorporateActionDate13.GuaranteedParticipationDate,
					com.tools20022.repository.msg.CorporateActionDate14.GuaranteedParticipationDate, com.tools20022.repository.msg.CorporateActionDate21.GuaranteedParticipationDate,
					com.tools20022.repository.msg.CorporateActionDate22.GuaranteedParticipationDate, com.tools20022.repository.msg.CorporateActionDate25.GuaranteedParticipationDate,
					com.tools20022.repository.msg.CorporateActionDate27.GuaranteedParticipationDate, com.tools20022.repository.msg.CorporateActionDate28.GuaranteedParticipationDate,
					com.tools20022.repository.msg.CorporateActionDate2.GuaranteedParticipationDate, com.tools20022.repository.msg.CorporateActionDate44.GuaranteedParticipationDate,
					com.tools20022.repository.msg.CorporateActionDate58.GuaranteedParticipationDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDeadline";
				definition = "Time constraints for processing corporate actions.";
				superType_lazy = () -> Deadline.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionDeadline.RevocabilityPeriod, com.tools20022.repository.entity.CorporateActionDeadline.ProtectDate,
						com.tools20022.repository.entity.CorporateActionDeadline.TradingSuspendedDate, com.tools20022.repository.entity.CorporateActionDeadline.ThirdPartyDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.CertificationDeadline, com.tools20022.repository.entity.CorporateActionDeadline.DeadlineToSplit,
						com.tools20022.repository.entity.CorporateActionDeadline.SpecialExDate, com.tools20022.repository.entity.CorporateActionDeadline.DeadlineForTaxBreakdownInstruction,
						com.tools20022.repository.entity.CorporateActionDeadline.EarlyClosingDate, com.tools20022.repository.entity.CorporateActionDeadline.RecordDate,
						com.tools20022.repository.entity.CorporateActionDeadline.CoverExpirationDate, com.tools20022.repository.entity.CorporateActionDeadline.ElectionToCounterpartyDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.ExpiryDate, com.tools20022.repository.entity.CorporateActionDeadline.EarlyThirdPartyDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.DepositoryCoverExpirationDate, com.tools20022.repository.entity.CorporateActionDeadline.ResponseDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.ConsentExpirationDate, com.tools20022.repository.entity.CorporateActionDeadline.RegistrationDeadline,
						com.tools20022.repository.entity.CorporateActionDeadline.StockLendingDeadline, com.tools20022.repository.entity.CorporateActionDeadline.ConsentRecordDate,
						com.tools20022.repository.entity.CorporateActionDeadline.EarlyResponseDeadline, com.tools20022.repository.entity.CorporateActionDeadline.GuaranteedParticipationDate);
				derivationComponent_lazy = () -> Arrays.asList(BorrowerLendingDeadline1.mmObject(), BorrowerLendingDeadline2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}