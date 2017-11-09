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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Deadline;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRevocabilityPeriod
 * CorporateActionDeadline.mmRevocabilityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmProtectDate
 * CorporateActionDeadline.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmTradingSuspendedDate
 * CorporateActionDeadline.mmTradingSuspendedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmThirdPartyDeadline
 * CorporateActionDeadline.mmThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCertificationDeadline
 * CorporateActionDeadline.mmCertificationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineToSplit
 * CorporateActionDeadline.mmDeadlineToSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmSpecialExDate
 * CorporateActionDeadline.mmSpecialExDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineForTaxBreakdownInstruction
 * CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyClosingDate
 * CorporateActionDeadline.mmEarlyClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
 * CorporateActionDeadline.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCoverExpirationDate
 * CorporateActionDeadline.mmCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmExpiryDate
 * CorporateActionDeadline.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyThirdPartyDeadline
 * CorporateActionDeadline.mmEarlyThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDepositoryCoverExpirationDate
 * CorporateActionDeadline.mmDepositoryCoverExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmResponseDeadline
 * CorporateActionDeadline.mmResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmConsentExpirationDate
 * CorporateActionDeadline.mmConsentExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRegistrationDeadline
 * CorporateActionDeadline.mmRegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmStockLendingDeadline
 * CorporateActionDeadline.mmStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmConsentRecordDate
 * CorporateActionDeadline.mmConsentRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyResponseDeadline
 * CorporateActionDeadline.mmEarlyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmGuaranteedParticipationDate
 * CorporateActionDeadline.mmGuaranteedParticipationDate}</li>
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
 * "CorporateActionDeadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Time constraints for processing corporate actions."</li>
 * </ul>
 */
public class CorporateActionDeadline extends Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod revocabilityPeriod;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#mmRevocabilityPeriod
	 * CorporateActionPeriod5.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#mmAccountServicerRevocabilityPeriod
	 * CorporateActionPeriod5.mmAccountServicerRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmRevocabilityPeriod
	 * CorporateActionPeriod7.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmAccountServicerRevocabilityPeriod
	 * CorporateActionPeriod7.mmAccountServicerRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmRevocabilityPeriod
	 * CorporateActionPeriod2.mmRevocabilityPeriod}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRevocabilityPeriod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod5.mmRevocabilityPeriod, CorporateActionPeriod5.mmAccountServicerRevocabilityPeriod, CorporateActionPeriod7.mmRevocabilityPeriod,
					CorporateActionPeriod7.mmAccountServicerRevocabilityPeriod, CorporateActionPeriod2.mmRevocabilityPeriod);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevocabilityPeriod";
			definition = "Period during which the shareholder can revoke, change or withdraw its instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected ISODateTime protectDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#mmProtectDate
	 * CorporateActionDate6.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#mmProtectDate
	 * CorporateActionDate10.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#mmProtectDate
	 * CorporateActionDate18.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#mmProtectDate
	 * CorporateActionDate19.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmProtectDate
	 * CorporateActionDate8.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmProtectDate
	 * CorporateActionDate11.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmProtectDate
	 * CorporateActionDate15.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmProtectDate
	 * CorporateActionDate16.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmProtectDate
	 * CorporateActionDate2.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmProtectDate
	 * CorporateActionDate29.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmProtectDate
	 * CorporateActionDate33.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmProtectDate
	 * CorporateActionDate46.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmProtectDate
	 * CorporateActionDate48.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#mmProtectDate
	 * CorporateActionDate52.mmProtectDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmProtectDate
	 * CorporateActionDate55.mmProtectDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmProtectDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate6.mmProtectDate, CorporateActionDate10.mmProtectDate, CorporateActionDate18.mmProtectDate, CorporateActionDate19.mmProtectDate, CorporateActionDate8.mmProtectDate,
					CorporateActionDate11.mmProtectDate, CorporateActionDate15.mmProtectDate, CorporateActionDate16.mmProtectDate, CorporateActionDate2.mmProtectDate, CorporateActionDate29.mmProtectDate,
					CorporateActionDate33.mmProtectDate, CorporateActionDate46.mmProtectDate, CorporateActionDate48.mmProtectDate, CorporateActionDate52.mmProtectDate, CorporateActionDate55.mmProtectDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProtectDate";
			definition = "Last date a holder can request to defer delivery of securities pursuant to a notice of guaranteed delivery or other required documentation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime tradingSuspendedDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmTradingSuspendedDate
	 * CorporateActionDate1.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmTradingSuspendedDate
	 * CorporateActionDate13.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmTradingSuspendedDate
	 * CorporateActionDate14.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmTradingSuspendedDate
	 * CorporateActionDate21.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmTradingSuspendedDate
	 * CorporateActionDate22.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmTradingSuspendedDate
	 * CorporateActionDate25.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmTradingSuspendedDate
	 * CorporateActionDate27.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmTradingSuspendedDate
	 * CorporateActionDate28.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmTradingSuspendedDate
	 * CorporateActionDate2.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmTradingSuspendedDate
	 * CorporateActionDate44.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmTradingSuspendedDate
	 * CorporateActionDate58.mmTradingSuspendedDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTradingSuspendedDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmTradingSuspendedDate, CorporateActionDate13.mmTradingSuspendedDate, CorporateActionDate14.mmTradingSuspendedDate, CorporateActionDate21.mmTradingSuspendedDate,
					CorporateActionDate22.mmTradingSuspendedDate, CorporateActionDate25.mmTradingSuspendedDate, CorporateActionDate27.mmTradingSuspendedDate, CorporateActionDate28.mmTradingSuspendedDate,
					CorporateActionDate2.mmTradingSuspendedDate, CorporateActionDate44.mmTradingSuspendedDate, CorporateActionDate58.mmTradingSuspendedDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date on which trading of a security is suspended as the result of an event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime thirdPartyDeadline;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmThirdPartyDeadline
	 * CorporateActionDate1.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmThirdPartyDeadline
	 * CorporateActionDate13.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmThirdPartyDeadline
	 * CorporateActionDate14.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmThirdPartyDeadline
	 * CorporateActionDate21.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmThirdPartyDeadline
	 * CorporateActionDate22.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmThirdPartyDeadline
	 * CorporateActionDate25.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmThirdPartyDeadline
	 * CorporateActionDate27.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmThirdPartyDeadline
	 * CorporateActionDate28.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmThirdPartyDeadline
	 * CorporateActionDate44.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmThirdPartyDeadline
	 * CorporateActionDate58.mmThirdPartyDeadline}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmThirdPartyDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmThirdPartyDeadline, CorporateActionDate13.mmThirdPartyDeadline, CorporateActionDate14.mmThirdPartyDeadline, CorporateActionDate21.mmThirdPartyDeadline,
					CorporateActionDate22.mmThirdPartyDeadline, CorporateActionDate25.mmThirdPartyDeadline, CorporateActionDate27.mmThirdPartyDeadline, CorporateActionDate28.mmThirdPartyDeadline, CorporateActionDate44.mmThirdPartyDeadline,
					CorporateActionDate58.mmThirdPartyDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdPartyDeadline";
			definition = "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime certificationDeadline;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmCertificationDeadline
	 * CorporateActionDate1.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmCertificationDeadline
	 * CorporateActionDate13.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmCertificationDeadline
	 * CorporateActionDate14.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmCertificationDeadline
	 * CorporateActionDate21.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmCertificationDeadline
	 * CorporateActionDate22.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmCertificationDeadline
	 * CorporateActionDate25.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmCertificationDeadline
	 * CorporateActionDate27.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmCertificationDeadline
	 * CorporateActionDate28.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmCertificationDeadline
	 * CorporateActionDate2.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmCertificationDeadline
	 * CorporateActionDate44.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmCertificationDeadline
	 * CorporateActionDate58.mmCertificationDeadline}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCertificationDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmCertificationDeadline, CorporateActionDate13.mmCertificationDeadline, CorporateActionDate14.mmCertificationDeadline, CorporateActionDate21.mmCertificationDeadline,
					CorporateActionDate22.mmCertificationDeadline, CorporateActionDate25.mmCertificationDeadline, CorporateActionDate27.mmCertificationDeadline, CorporateActionDate28.mmCertificationDeadline,
					CorporateActionDate2.mmCertificationDeadline, CorporateActionDate44.mmCertificationDeadline, CorporateActionDate58.mmCertificationDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the beneficial ownership of securities must be declared.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime deadlineToSplit;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmDeadlineToSplit
	 * CorporateActionDate1.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmDeadlineToSplit
	 * CorporateActionDate13.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmDeadlineToSplit
	 * CorporateActionDate14.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmDeadlineToSplit
	 * CorporateActionDate21.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmDeadlineToSplit
	 * CorporateActionDate22.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmDeadlineToSplit
	 * CorporateActionDate25.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmDeadlineToSplit
	 * CorporateActionDate27.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmDeadlineToSplit
	 * CorporateActionDate28.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmDeadlineToSplit
	 * CorporateActionDate4.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmDeadlineToSplit
	 * CorporateActionDate44.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmDeadlineToSplit
	 * CorporateActionDate58.mmDeadlineToSplit}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDeadlineToSplit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmDeadlineToSplit, CorporateActionDate13.mmDeadlineToSplit, CorporateActionDate14.mmDeadlineToSplit, CorporateActionDate21.mmDeadlineToSplit,
					CorporateActionDate22.mmDeadlineToSplit, CorporateActionDate25.mmDeadlineToSplit, CorporateActionDate27.mmDeadlineToSplit, CorporateActionDate28.mmDeadlineToSplit, CorporateActionDate4.mmDeadlineToSplit,
					CorporateActionDate44.mmDeadlineToSplit, CorporateActionDate58.mmDeadlineToSplit);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, that is, of physical certificates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime specialExDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmSpecialExDate
	 * CorporateActionDate1.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmSpecialExDate
	 * CorporateActionDate13.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmSpecialExDate
	 * CorporateActionDate14.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmSpecialExDate
	 * CorporateActionDate21.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmSpecialExDate
	 * CorporateActionDate22.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmSpecialExDate
	 * CorporateActionDate25.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmSpecialExDate
	 * CorporateActionDate27.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmSpecialExDate
	 * CorporateActionDate28.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmSpecialExDate
	 * CorporateActionDate2.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmSpecialExDate
	 * CorporateActionDate44.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmSpecialExDate
	 * CorporateActionDate58.mmSpecialExDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSpecialExDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmSpecialExDate, CorporateActionDate13.mmSpecialExDate, CorporateActionDate14.mmSpecialExDate, CorporateActionDate21.mmSpecialExDate,
					CorporateActionDate22.mmSpecialExDate, CorporateActionDate25.mmSpecialExDate, CorporateActionDate27.mmSpecialExDate, CorporateActionDate28.mmSpecialExDate, CorporateActionDate2.mmSpecialExDate,
					CorporateActionDate44.mmSpecialExDate, CorporateActionDate58.mmSpecialExDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime deadlineForTaxBreakdownInstruction;
	/**
	 * Date until which tax breakdown instructions will be accepted.
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate1.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate13.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate14.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate21.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate22.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate25.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate27.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate28.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate2.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate44.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDate58.mmDeadlineForTaxBreakdownInstruction}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDeadlineForTaxBreakdownInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmDeadlineForTaxBreakdownInstruction, CorporateActionDate13.mmDeadlineForTaxBreakdownInstruction, CorporateActionDate14.mmDeadlineForTaxBreakdownInstruction,
					CorporateActionDate21.mmDeadlineForTaxBreakdownInstruction, CorporateActionDate22.mmDeadlineForTaxBreakdownInstruction, CorporateActionDate25.mmDeadlineForTaxBreakdownInstruction,
					CorporateActionDate27.mmDeadlineForTaxBreakdownInstruction, CorporateActionDate28.mmDeadlineForTaxBreakdownInstruction, CorporateActionDate2.mmDeadlineForTaxBreakdownInstruction,
					CorporateActionDate44.mmDeadlineForTaxBreakdownInstruction, CorporateActionDate58.mmDeadlineForTaxBreakdownInstruction);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeadlineForTaxBreakdownInstruction";
			definition = "Date until which tax breakdown instructions will be accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime earlyClosingDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmEarlyClosingDate
	 * CorporateActionDate1.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmEarlyClosingDate
	 * CorporateActionDate13.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmEarlyClosingDate
	 * CorporateActionDate14.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmEarlyClosingDate
	 * CorporateActionDate21.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmEarlyClosingDate
	 * CorporateActionDate22.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmEarlyClosingDate
	 * CorporateActionDate25.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmEarlyClosingDate
	 * CorporateActionDate27.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmEarlyClosingDate
	 * CorporateActionDate28.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEarlyClosingDate
	 * CorporateActionDate2.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEarlyClosingDate
	 * CorporateActionDate44.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmEarlyClosingDate
	 * CorporateActionDate58.mmEarlyClosingDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEarlyClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmEarlyClosingDate, CorporateActionDate13.mmEarlyClosingDate, CorporateActionDate14.mmEarlyClosingDate, CorporateActionDate21.mmEarlyClosingDate,
					CorporateActionDate22.mmEarlyClosingDate, CorporateActionDate25.mmEarlyClosingDate, CorporateActionDate27.mmEarlyClosingDate, CorporateActionDate28.mmEarlyClosingDate, CorporateActionDate2.mmEarlyClosingDate,
					CorporateActionDate44.mmEarlyClosingDate, CorporateActionDate58.mmEarlyClosingDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyClosingDate";
			definition = "First possible early closing date of an offer if different from the expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime recordDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmRecordDate
	 * CorporateActionDate1.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmRecordDate
	 * CorporateActionDate13.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmRecordDate
	 * CorporateActionDate14.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmRecordDate
	 * CorporateActionDate21.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmRecordDate
	 * CorporateActionDate22.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmRecordDate
	 * CorporateActionDate25.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmRecordDate
	 * CorporateActionDate27.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmRecordDate
	 * CorporateActionDate28.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmRecordDate
	 * EntitlementAssessment.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates#mmRecordDate
	 * EligibilityDates.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmRecordDate
	 * CorporateActionDate2.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmRecordDate
	 * EntitlementAdvice1.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmRecordDate
	 * GlobalDistributionRequest1.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmRecordDate
	 * CommonFinancialInstrumentAttributes1.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate30#mmRecordDate
	 * CorporateActionDate30.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate34#mmRecordDate
	 * CorporateActionDate34.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate41#mmRecordDate
	 * CorporateActionDate41.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate43#mmRecordDate
	 * CorporateActionDate43.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate49#mmRecordDate
	 * CorporateActionDate49.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate45#mmRecordDate
	 * CorporateActionDate45.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmRecordDate
	 * CorporateActionDate44.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate54#mmRecordDate
	 * CorporateActionDate54.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate50#mmRecordDate
	 * CorporateActionDate50.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmRecordDate
	 * CorporateActionDate58.mmRecordDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRecordDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmRecordDate, CorporateActionDate13.mmRecordDate, CorporateActionDate14.mmRecordDate, CorporateActionDate21.mmRecordDate, CorporateActionDate22.mmRecordDate,
					CorporateActionDate25.mmRecordDate, CorporateActionDate27.mmRecordDate, CorporateActionDate28.mmRecordDate, EntitlementAssessment.mmRecordDate, EligibilityDates.mmRecordDate, CorporateActionDate2.mmRecordDate,
					EntitlementAdvice1.mmRecordDate, GlobalDistributionRequest1.mmRecordDate, CommonFinancialInstrumentAttributes1.mmRecordDate, CorporateActionDate30.mmRecordDate, CorporateActionDate34.mmRecordDate,
					CorporateActionDate41.mmRecordDate, CorporateActionDate43.mmRecordDate, CorporateActionDate49.mmRecordDate, CorporateActionDate45.mmRecordDate, CorporateActionDate44.mmRecordDate, CorporateActionDate54.mmRecordDate,
					CorporateActionDate50.mmRecordDate, CorporateActionDate58.mmRecordDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecordDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime coverExpirationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#mmCoverExpirationDate
	 * CorporateActionDate6.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#mmCoverExpirationDate
	 * CorporateActionDate10.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#mmCoverExpirationDate
	 * CorporateActionDate18.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#mmCoverExpirationDate
	 * CorporateActionDate19.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmCoverExpirationDate
	 * CorporateActionDate8.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmCoverExpirationDate
	 * CorporateActionDate11.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmCoverExpirationDate
	 * CorporateActionDate15.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmCoverExpirationDate
	 * CorporateActionDate16.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmCoverExpirationDate
	 * CorporateActionDate2.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmCoverExpirationDate
	 * CorporateActionDate29.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmCoverExpirationDate
	 * CorporateActionDate33.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmCoverExpirationDate
	 * CorporateActionDate46.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmCoverExpirationDate
	 * CorporateActionDate48.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#mmCoverExpirationDate
	 * CorporateActionDate52.mmCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmCoverExpirationDate
	 * CorporateActionDate55.mmCoverExpirationDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCoverExpirationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate6.mmCoverExpirationDate, CorporateActionDate10.mmCoverExpirationDate, CorporateActionDate18.mmCoverExpirationDate, CorporateActionDate19.mmCoverExpirationDate,
					CorporateActionDate8.mmCoverExpirationDate, CorporateActionDate11.mmCoverExpirationDate, CorporateActionDate15.mmCoverExpirationDate, CorporateActionDate16.mmCoverExpirationDate,
					CorporateActionDate2.mmCoverExpirationDate, CorporateActionDate29.mmCoverExpirationDate, CorporateActionDate33.mmCoverExpirationDate, CorporateActionDate46.mmCoverExpirationDate,
					CorporateActionDate48.mmCoverExpirationDate, CorporateActionDate52.mmCoverExpirationDate, CorporateActionDate55.mmCoverExpirationDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverExpirationDate";
			definition = "Last day a holder can deliver the securities that it had previously protected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime electionToCounterpartyDeadline;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmElectionToCounterpartyDeadline
	 * CorporateActionDate1.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmElectionToCounterpartyDeadline
	 * CorporateActionDate13.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmElectionToCounterpartyDeadline
	 * CorporateActionDate14.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmElectionToCounterpartyDeadline
	 * CorporateActionDate21.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmElectionToCounterpartyDeadline
	 * CorporateActionDate22.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmElectionToCounterpartyDeadline
	 * CorporateActionDate25.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmElectionToCounterpartyDeadline
	 * CorporateActionDate27.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmElectionToCounterpartyDeadline
	 * CorporateActionDate28.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmElectionToCounterpartyDeadline
	 * CorporateActionDate2.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmElectionToCounterpartyMarketDeadline
	 * CorporateActionDate44.mmElectionToCounterpartyMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmElectionToCounterpartyResponseDeadline
	 * CorporateActionDate44.mmElectionToCounterpartyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmElectionToCounterpartyMarketDeadline
	 * CorporateActionDate58.mmElectionToCounterpartyMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmElectionToCounterpartyResponseDeadline
	 * CorporateActionDate58.mmElectionToCounterpartyResponseDeadline}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmElectionToCounterpartyDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmElectionToCounterpartyDeadline, CorporateActionDate13.mmElectionToCounterpartyDeadline, CorporateActionDate14.mmElectionToCounterpartyDeadline,
					CorporateActionDate21.mmElectionToCounterpartyDeadline, CorporateActionDate22.mmElectionToCounterpartyDeadline, CorporateActionDate25.mmElectionToCounterpartyDeadline,
					CorporateActionDate27.mmElectionToCounterpartyDeadline, CorporateActionDate28.mmElectionToCounterpartyDeadline, CorporateActionDate2.mmElectionToCounterpartyDeadline,
					CorporateActionDate44.mmElectionToCounterpartyMarketDeadline, CorporateActionDate44.mmElectionToCounterpartyResponseDeadline, CorporateActionDate58.mmElectionToCounterpartyMarketDeadline,
					CorporateActionDate58.mmElectionToCounterpartyResponseDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectionToCounterpartyDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime expiryDate;
	/**
	 * Date on which the offer terminates.
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#mmExpiryDate
	 * CorporateActionDate6.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#mmExpiryDate
	 * CorporateActionDate10.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#mmExpiryDate
	 * CorporateActionDate18.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#mmExpiryDate
	 * CorporateActionDate19.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmExpiryDate
	 * CorporateActionDate8.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmExpiryDate
	 * CorporateActionDate11.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmExpiryDate
	 * CorporateActionDate15.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmExpiryDate
	 * CorporateActionDate16.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmExpiryDate
	 * CorporateActionDate4.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmExpiryDate
	 * CorporateActionDate29.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmExpiryDate
	 * CorporateActionDate33.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmExpiryDate
	 * CorporateActionDate46.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmExpiryDate
	 * CorporateActionDate48.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#mmExpiryDate
	 * CorporateActionDate52.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmExpiryDate
	 * CorporateActionDate55.mmExpiryDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate6.mmExpiryDate, CorporateActionDate10.mmExpiryDate, CorporateActionDate18.mmExpiryDate, CorporateActionDate19.mmExpiryDate, CorporateActionDate8.mmExpiryDate,
					CorporateActionDate11.mmExpiryDate, CorporateActionDate15.mmExpiryDate, CorporateActionDate16.mmExpiryDate, CorporateActionDate4.mmExpiryDate, CorporateActionDate29.mmExpiryDate, CorporateActionDate33.mmExpiryDate,
					CorporateActionDate46.mmExpiryDate, CorporateActionDate48.mmExpiryDate, CorporateActionDate52.mmExpiryDate, CorporateActionDate55.mmExpiryDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which the offer terminates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime earlyThirdPartyDeadline;
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
	public static final MMBusinessAttribute mmEarlyThirdPartyDeadline = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyThirdPartyDeadline";
			definition = "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime depositoryCoverExpirationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmDepositoryCoverExpirationDate
	 * CorporateActionDate8.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmDepositoryCoverExpirationDate
	 * CorporateActionDate11.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmDepositoryCoverExpirationDate
	 * CorporateActionDate15.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmDepositoryCoverExpirationDate
	 * CorporateActionDate16.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmDepositoryCoverExpirationDate
	 * CorporateActionDate29.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmDepositoryCoverExpirationDate
	 * CorporateActionDate33.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmDepositoryCoverExpirationDate
	 * CorporateActionDate48.mmDepositoryCoverExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmDepositoryCoverExpirationDate
	 * CorporateActionDate55.mmDepositoryCoverExpirationDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDepositoryCoverExpirationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate8.mmDepositoryCoverExpirationDate, CorporateActionDate11.mmDepositoryCoverExpirationDate, CorporateActionDate15.mmDepositoryCoverExpirationDate,
					CorporateActionDate16.mmDepositoryCoverExpirationDate, CorporateActionDate29.mmDepositoryCoverExpirationDate, CorporateActionDate33.mmDepositoryCoverExpirationDate, CorporateActionDate48.mmDepositoryCoverExpirationDate,
					CorporateActionDate55.mmDepositoryCoverExpirationDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositoryCoverExpirationDate";
			definition = "The last date/tiime that a participant of the depository can deliver securities that it had elected on and/or previously protected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime responseDeadline;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#mmResponseDeadline
	 * CorporateActionDate6.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#mmResponseDeadline
	 * CorporateActionDate10.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#mmResponseDeadline
	 * CorporateActionDate18.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#mmResponseDeadline
	 * CorporateActionDate19.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmResponseDeadline
	 * CorporateActionDate8.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmResponseDeadline
	 * CorporateActionDate11.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmResponseDeadline
	 * CorporateActionDate15.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmResponseDeadline
	 * CorporateActionDate16.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmResponseDeadline
	 * CorporateActionDate4.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#mmResponseDeadline
	 * CorporateActionOption11.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmResponseDeadline
	 * CorporateActionDate29.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmResponseDeadline
	 * CorporateActionDate33.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmResponseDeadline
	 * CorporateActionDate46.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmResponseDeadline
	 * CorporateActionDate48.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#mmResponseDeadline
	 * CorporateActionDate52.mmResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmResponseDeadline
	 * CorporateActionDate55.mmResponseDeadline}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmResponseDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate6.mmResponseDeadline, CorporateActionDate10.mmResponseDeadline, CorporateActionDate18.mmResponseDeadline, CorporateActionDate19.mmResponseDeadline,
					CorporateActionDate8.mmResponseDeadline, CorporateActionDate11.mmResponseDeadline, CorporateActionDate15.mmResponseDeadline, CorporateActionDate16.mmResponseDeadline, CorporateActionDate4.mmResponseDeadline,
					CorporateActionOption11.mmResponseDeadline, CorporateActionDate29.mmResponseDeadline, CorporateActionDate33.mmResponseDeadline, CorporateActionDate46.mmResponseDeadline, CorporateActionDate48.mmResponseDeadline,
					CorporateActionDate52.mmResponseDeadline, CorporateActionDate55.mmResponseDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResponseDeadline";
			definition = "Date on which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in an SLA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime consentExpirationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmConsentExpirationDate
	 * CorporateActionDate4.mmConsentExpirationDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmConsentExpirationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmConsentExpirationDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentExpirationDate";
			definition = "Last date on which a holder can consent to the changes sought by the corporation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime registrationDeadline;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmRegistrationDeadline
	 * CorporateActionDate1.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmRegistrationDeadline
	 * CorporateActionDate13.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmRegistrationDeadline
	 * CorporateActionDate14.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmRegistrationDeadline
	 * CorporateActionDate21.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmRegistrationDeadline
	 * CorporateActionDate22.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmRegistrationDeadline
	 * CorporateActionDate25.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmRegistrationDeadline
	 * CorporateActionDate27.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmRegistrationDeadline
	 * CorporateActionDate28.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmRegistrationDeadline
	 * CorporateActionDate2.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmRegistrationDeadline
	 * CorporateActionDate44.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmRegistrationDeadline
	 * CorporateActionDate58.mmRegistrationDeadline}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRegistrationDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmRegistrationDeadline, CorporateActionDate13.mmRegistrationDeadline, CorporateActionDate14.mmRegistrationDeadline, CorporateActionDate21.mmRegistrationDeadline,
					CorporateActionDate22.mmRegistrationDeadline, CorporateActionDate25.mmRegistrationDeadline, CorporateActionDate27.mmRegistrationDeadline, CorporateActionDate28.mmRegistrationDeadline,
					CorporateActionDate2.mmRegistrationDeadline, CorporateActionDate44.mmRegistrationDeadline, CorporateActionDate58.mmRegistrationDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date on which instructions to register or registration details will be accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime stockLendingDeadline;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmStockLendingDeadline
	 * CorporateActionDate29.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmStockLendingDeadline
	 * CorporateActionDate33.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmStockLendingDeadline
	 * CorporateActionDate48.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline1#mmStockLendingDeadline
	 * BorrowerLendingDeadline1.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmStockLendingDeadline
	 * CorporateActionDate55.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline2#mmStockLendingDeadline
	 * BorrowerLendingDeadline2.mmStockLendingDeadline}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmStockLendingDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate29.mmStockLendingDeadline, CorporateActionDate33.mmStockLendingDeadline, CorporateActionDate48.mmStockLendingDeadline, BorrowerLendingDeadline1.mmStockLendingDeadline,
					CorporateActionDate55.mmStockLendingDeadline, BorrowerLendingDeadline2.mmStockLendingDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockLendingDeadline";
			definition = "Date or date and time that the account servicer has set as the deadline to respond with instructions to an event for which the underlying security is out on loan. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime consentRecordDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmConsentRecordDate
	 * CorporateActionDate4.mmConsentRecordDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmConsentRecordDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate4.mmConsentRecordDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentRecordDate";
			definition = "Date used by the offeror to determine the beneficiary eligible to participate in a consent based on the registered owner of the securities, eg, beneficial owner of consent record. The consent record date qualifier is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.\r\nThe consent record date is used to indicate that a record date only applies to a certain part of the offer, not the entire offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime earlyResponseDeadline;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmEarlyResponseDeadline
	 * CorporateActionDate8.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmEarlyResponseDeadline
	 * CorporateActionDate11.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmEarlyResponseDeadline
	 * CorporateActionDate15.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmEarlyResponseDeadline
	 * CorporateActionDate16.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmEarlyThirdPartyDeadline
	 * CorporateActionDate1.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmEarlyThirdPartyDeadline
	 * CorporateActionDate13.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmEarlyThirdPartyDeadline
	 * CorporateActionDate14.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmEarlyThirdPartyDeadline
	 * CorporateActionDate21.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmEarlyThirdPartyDeadline
	 * CorporateActionDate22.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmEarlyThirdPartyDeadline
	 * CorporateActionDate25.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmEarlyThirdPartyDeadline
	 * CorporateActionDate27.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmEarlyThirdPartyDeadline
	 * CorporateActionDate28.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmEarlyResponseDeadline
	 * CorporateActionDate29.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmEarlyResponseDeadline
	 * CorporateActionDate33.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmEarlyResponseDeadline
	 * CorporateActionDate48.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEarlyThirdPartyDeadline
	 * CorporateActionDate44.mmEarlyThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmEarlyResponseDeadline
	 * CorporateActionDate55.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmEarlyThirdPartyDeadline
	 * CorporateActionDate58.mmEarlyThirdPartyDeadline}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmEarlyResponseDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate8.mmEarlyResponseDeadline, CorporateActionDate11.mmEarlyResponseDeadline, CorporateActionDate15.mmEarlyResponseDeadline, CorporateActionDate16.mmEarlyResponseDeadline,
					CorporateActionDate1.mmEarlyThirdPartyDeadline, CorporateActionDate13.mmEarlyThirdPartyDeadline, CorporateActionDate14.mmEarlyThirdPartyDeadline, CorporateActionDate21.mmEarlyThirdPartyDeadline,
					CorporateActionDate22.mmEarlyThirdPartyDeadline, CorporateActionDate25.mmEarlyThirdPartyDeadline, CorporateActionDate27.mmEarlyThirdPartyDeadline, CorporateActionDate28.mmEarlyThirdPartyDeadline,
					CorporateActionDate29.mmEarlyResponseDeadline, CorporateActionDate33.mmEarlyResponseDeadline, CorporateActionDate48.mmEarlyResponseDeadline, CorporateActionDate44.mmEarlyThirdPartyDeadline,
					CorporateActionDate55.mmEarlyResponseDeadline, CorporateActionDate58.mmEarlyThirdPartyDeadline);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlyResponseDeadline";
			definition = "Date/time that the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in an SLA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime guaranteedParticipationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
	 * CorporateActionDeadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmGuaranteedParticipationDate
	 * CorporateActionDate1.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmGuaranteedParticipationDate
	 * CorporateActionDate13.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmGuaranteedParticipationDate
	 * CorporateActionDate14.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmGuaranteedParticipationDate
	 * CorporateActionDate21.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmGuaranteedParticipationDate
	 * CorporateActionDate22.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmGuaranteedParticipationDate
	 * CorporateActionDate25.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmGuaranteedParticipationDate
	 * CorporateActionDate27.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmGuaranteedParticipationDate
	 * CorporateActionDate28.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmGuaranteedParticipationDate
	 * CorporateActionDate2.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmGuaranteedParticipationDate
	 * CorporateActionDate44.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmGuaranteedParticipationDate
	 * CorporateActionDate58.mmGuaranteedParticipationDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmGuaranteedParticipationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmGuaranteedParticipationDate, CorporateActionDate13.mmGuaranteedParticipationDate, CorporateActionDate14.mmGuaranteedParticipationDate,
					CorporateActionDate21.mmGuaranteedParticipationDate, CorporateActionDate22.mmGuaranteedParticipationDate, CorporateActionDate25.mmGuaranteedParticipationDate, CorporateActionDate27.mmGuaranteedParticipationDate,
					CorporateActionDate28.mmGuaranteedParticipationDate, CorporateActionDate2.mmGuaranteedParticipationDate, CorporateActionDate44.mmGuaranteedParticipationDate, CorporateActionDate58.mmGuaranteedParticipationDate);
			elementContext_lazy = () -> CorporateActionDeadline.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDeadline";
				definition = "Time constraints for processing corporate actions.";
				superType_lazy = () -> Deadline.mmObject();
				element_lazy = () -> Arrays.asList(CorporateActionDeadline.mmRevocabilityPeriod, CorporateActionDeadline.mmProtectDate, CorporateActionDeadline.mmTradingSuspendedDate, CorporateActionDeadline.mmThirdPartyDeadline,
						CorporateActionDeadline.mmCertificationDeadline, CorporateActionDeadline.mmDeadlineToSplit, CorporateActionDeadline.mmSpecialExDate, CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction,
						CorporateActionDeadline.mmEarlyClosingDate, CorporateActionDeadline.mmRecordDate, CorporateActionDeadline.mmCoverExpirationDate, CorporateActionDeadline.mmElectionToCounterpartyDeadline,
						CorporateActionDeadline.mmExpiryDate, CorporateActionDeadline.mmEarlyThirdPartyDeadline, CorporateActionDeadline.mmDepositoryCoverExpirationDate, CorporateActionDeadline.mmResponseDeadline,
						CorporateActionDeadline.mmConsentExpirationDate, CorporateActionDeadline.mmRegistrationDeadline, CorporateActionDeadline.mmStockLendingDeadline, CorporateActionDeadline.mmConsentRecordDate,
						CorporateActionDeadline.mmEarlyResponseDeadline, CorporateActionDeadline.mmGuaranteedParticipationDate);
				derivationComponent_lazy = () -> Arrays.asList(BorrowerLendingDeadline1.mmObject(), BorrowerLendingDeadline2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getRevocabilityPeriod() {
		return revocabilityPeriod;
	}

	public void setRevocabilityPeriod(com.tools20022.repository.entity.DateTimePeriod revocabilityPeriod) {
		this.revocabilityPeriod = revocabilityPeriod;
	}

	public ISODateTime getProtectDate() {
		return protectDate;
	}

	public void setProtectDate(ISODateTime protectDate) {
		this.protectDate = protectDate;
	}

	public ISODateTime getTradingSuspendedDate() {
		return tradingSuspendedDate;
	}

	public void setTradingSuspendedDate(ISODateTime tradingSuspendedDate) {
		this.tradingSuspendedDate = tradingSuspendedDate;
	}

	public ISODateTime getThirdPartyDeadline() {
		return thirdPartyDeadline;
	}

	public void setThirdPartyDeadline(ISODateTime thirdPartyDeadline) {
		this.thirdPartyDeadline = thirdPartyDeadline;
	}

	public ISODateTime getCertificationDeadline() {
		return certificationDeadline;
	}

	public void setCertificationDeadline(ISODateTime certificationDeadline) {
		this.certificationDeadline = certificationDeadline;
	}

	public ISODateTime getDeadlineToSplit() {
		return deadlineToSplit;
	}

	public void setDeadlineToSplit(ISODateTime deadlineToSplit) {
		this.deadlineToSplit = deadlineToSplit;
	}

	public ISODateTime getSpecialExDate() {
		return specialExDate;
	}

	public void setSpecialExDate(ISODateTime specialExDate) {
		this.specialExDate = specialExDate;
	}

	public ISODateTime getDeadlineForTaxBreakdownInstruction() {
		return deadlineForTaxBreakdownInstruction;
	}

	public void setDeadlineForTaxBreakdownInstruction(ISODateTime deadlineForTaxBreakdownInstruction) {
		this.deadlineForTaxBreakdownInstruction = deadlineForTaxBreakdownInstruction;
	}

	public ISODateTime getEarlyClosingDate() {
		return earlyClosingDate;
	}

	public void setEarlyClosingDate(ISODateTime earlyClosingDate) {
		this.earlyClosingDate = earlyClosingDate;
	}

	public ISODateTime getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(ISODateTime recordDate) {
		this.recordDate = recordDate;
	}

	public ISODateTime getCoverExpirationDate() {
		return coverExpirationDate;
	}

	public void setCoverExpirationDate(ISODateTime coverExpirationDate) {
		this.coverExpirationDate = coverExpirationDate;
	}

	public ISODateTime getElectionToCounterpartyDeadline() {
		return electionToCounterpartyDeadline;
	}

	public void setElectionToCounterpartyDeadline(ISODateTime electionToCounterpartyDeadline) {
		this.electionToCounterpartyDeadline = electionToCounterpartyDeadline;
	}

	public ISODateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public ISODateTime getEarlyThirdPartyDeadline() {
		return earlyThirdPartyDeadline;
	}

	public void setEarlyThirdPartyDeadline(ISODateTime earlyThirdPartyDeadline) {
		this.earlyThirdPartyDeadline = earlyThirdPartyDeadline;
	}

	public ISODateTime getDepositoryCoverExpirationDate() {
		return depositoryCoverExpirationDate;
	}

	public void setDepositoryCoverExpirationDate(ISODateTime depositoryCoverExpirationDate) {
		this.depositoryCoverExpirationDate = depositoryCoverExpirationDate;
	}

	public ISODateTime getResponseDeadline() {
		return responseDeadline;
	}

	public void setResponseDeadline(ISODateTime responseDeadline) {
		this.responseDeadline = responseDeadline;
	}

	public ISODateTime getConsentExpirationDate() {
		return consentExpirationDate;
	}

	public void setConsentExpirationDate(ISODateTime consentExpirationDate) {
		this.consentExpirationDate = consentExpirationDate;
	}

	public ISODateTime getRegistrationDeadline() {
		return registrationDeadline;
	}

	public void setRegistrationDeadline(ISODateTime registrationDeadline) {
		this.registrationDeadline = registrationDeadline;
	}

	public ISODateTime getStockLendingDeadline() {
		return stockLendingDeadline;
	}

	public void setStockLendingDeadline(ISODateTime stockLendingDeadline) {
		this.stockLendingDeadline = stockLendingDeadline;
	}

	public ISODateTime getConsentRecordDate() {
		return consentRecordDate;
	}

	public void setConsentRecordDate(ISODateTime consentRecordDate) {
		this.consentRecordDate = consentRecordDate;
	}

	public ISODateTime getEarlyResponseDeadline() {
		return earlyResponseDeadline;
	}

	public void setEarlyResponseDeadline(ISODateTime earlyResponseDeadline) {
		this.earlyResponseDeadline = earlyResponseDeadline;
	}

	public ISODateTime getGuaranteedParticipationDate() {
		return guaranteedParticipationDate;
	}

	public void setGuaranteedParticipationDate(ISODateTime guaranteedParticipationDate) {
		this.guaranteedParticipationDate = guaranteedParticipationDate;
	}
}