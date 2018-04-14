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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * When used (see usage rule SafekeepingPlaceRule), unless special arrangements
 * exist between the account servicer and the<br>
 * account owner, it is recommended to use the place of safekeeping field
 * following the market practice<br>
 * described below:<br>
 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
 * domestic and NCSD to NCSD settlement instructions.<br>
 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD
 * internal, ICSD/local and ICSD to ICSD settlement<br>
 * instructions.<br>
 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance,
 * when the account servicer is a global custodian and provides the account
 * owner with a position reporting at global custodian's agents' level. When
 * instructing, the fund manager would therefore mention, as a place of
 * safekeeping, the BIC of the global custodian's agent on the market.<br>
 * Absence of SafekeepingPlace means that:<br>
 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
 * structure, ETC.) and should not be provided by the account owner.<br>
 * • The SafekeepingPlace is the counterparty's Depository. The transaction is
 * therefore domestic (to an NCSD) or internal to an ICSD.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintSafekeepingPlaceGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount57
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount57}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount51> forQuantityAndAccount51 = new MMConstraint<QuantityAndAccount51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount57);
			owner_lazy = () -> QuantityAndAccount51.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount51 obj) throws Exception {
			checkQuantityAndAccount51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55
	 * QuantityAndAccount55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount60
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount60}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount55> forQuantityAndAccount55 = new MMConstraint<QuantityAndAccount55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount60);
			owner_lazy = () -> QuantityAndAccount55.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount55 obj) throws Exception {
			checkQuantityAndAccount55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72
	 * QuantityAndAccount72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount72> forQuantityAndAccount72 = new MMConstraint<QuantityAndAccount72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount72.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount72 obj) throws Exception {
			checkQuantityAndAccount72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33
	 * QuantityAndAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount33> forQuantityAndAccount33 = new MMConstraint<QuantityAndAccount33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount33.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount33 obj) throws Exception {
			checkQuantityAndAccount33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount44
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount44}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount66> forQuantityAndAccount66 = new MMConstraint<QuantityAndAccount66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount44;
			owner_lazy = () -> QuantityAndAccount66.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount66 obj) throws Exception {
			checkQuantityAndAccount66(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65
	 * QuantityAndAccount65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the account owner, it is recommended to use the place of safekeeping field following the market practice described below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount39
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount39}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount65> forQuantityAndAccount65 = new MMConstraint<QuantityAndAccount65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the account owner, it is recommended to use the place of safekeeping field following the market practice described below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount39;
			owner_lazy = () -> QuantityAndAccount65.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount65 obj) throws Exception {
			checkQuantityAndAccount65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30
	 * QuantityAndAccount30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount43
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount43}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount30> forQuantityAndAccount30 = new MMConstraint<QuantityAndAccount30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount43);
			owner_lazy = () -> QuantityAndAccount30.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount30 obj) throws Exception {
			checkQuantityAndAccount30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68
	 * QuantityAndAccount68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount43
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount43}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount68> forQuantityAndAccount68 = new MMConstraint<QuantityAndAccount68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount43;
			owner_lazy = () -> QuantityAndAccount68.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount68 obj) throws Exception {
			checkQuantityAndAccount68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12
	 * QuantityAndAccount12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount12> forQuantityAndAccount12 = new MMConstraint<QuantityAndAccount12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount12.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount12 obj) throws Exception {
			checkQuantityAndAccount12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5
	 * QuantityAndAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount5> forQuantityAndAccount5 = new MMConstraint<QuantityAndAccount5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount5.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount5 obj) throws Exception {
			checkQuantityAndAccount5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount69
	 * QuantityAndAccount69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the account owner, it is recommended to use the place of safekeeping field following the market practice described below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount69> forQuantityAndAccount69 = new MMConstraint<QuantityAndAccount69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the account owner, it is recommended to use the place of safekeeping field following the market practice described below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount69.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount69 obj) throws Exception {
			checkQuantityAndAccount69(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17
	 * QuantityAndAccount17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount17> forQuantityAndAccount17 = new MMConstraint<QuantityAndAccount17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount17.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount17 obj) throws Exception {
			checkQuantityAndAccount17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32
	 * QuantityAndAccount32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount32> forQuantityAndAccount32 = new MMConstraint<QuantityAndAccount32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount32.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount32 obj) throws Exception {
			checkQuantityAndAccount32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28
	 * QuantityAndAccount28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount41
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount41}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount28> forQuantityAndAccount28 = new MMConstraint<QuantityAndAccount28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount41);
			owner_lazy = () -> QuantityAndAccount28.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount28 obj) throws Exception {
			checkQuantityAndAccount28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47
	 * QuantityAndAccount47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount56
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount56}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount47> forQuantityAndAccount47 = new MMConstraint<QuantityAndAccount47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount56);
			owner_lazy = () -> QuantityAndAccount47.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount47 obj) throws Exception {
			checkQuantityAndAccount47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59
	 * QuantityAndAccount59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount54
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount54}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount59> forQuantityAndAccount59 = new MMConstraint<QuantityAndAccount59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount54;
			owner_lazy = () -> QuantityAndAccount59.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount59 obj) throws Exception {
			checkQuantityAndAccount59(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount64
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount64}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount28
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount28}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount41> forQuantityAndAccount41 = new MMConstraint<QuantityAndAccount41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount64);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount28;
			owner_lazy = () -> QuantityAndAccount41.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount41 obj) throws Exception {
			checkQuantityAndAccount41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44
	 * QuantityAndAccount44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount66
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount66}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount29
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount29}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount44> forQuantityAndAccount44 = new MMConstraint<QuantityAndAccount44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount66);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount29;
			owner_lazy = () -> QuantityAndAccount44.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount44 obj) throws Exception {
			checkQuantityAndAccount44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39
	 * QuantityAndAccount39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount65
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount65}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount25
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount25}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount39> forQuantityAndAccount39 = new MMConstraint<QuantityAndAccount39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount25;
			owner_lazy = () -> QuantityAndAccount39.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount39 obj) throws Exception {
			checkQuantityAndAccount39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60
	 * QuantityAndAccount60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount55
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount55}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount60> forQuantityAndAccount60 = new MMConstraint<QuantityAndAccount60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount55;
			owner_lazy = () -> QuantityAndAccount60.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount60 obj) throws Exception {
			checkQuantityAndAccount60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25
	 * QuantityAndAccount25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount39
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount39}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount25> forQuantityAndAccount25 = new MMConstraint<QuantityAndAccount25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount39);
			owner_lazy = () -> QuantityAndAccount25.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount25 obj) throws Exception {
			checkQuantityAndAccount25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34
	 * QuantityAndAccount34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount34> forQuantityAndAccount34 = new MMConstraint<QuantityAndAccount34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount34.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount34 obj) throws Exception {
			checkQuantityAndAccount34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15
	 * QuantityAndAccount15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount15> forQuantityAndAccount15 = new MMConstraint<QuantityAndAccount15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount15.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount15 obj) throws Exception {
			checkQuantityAndAccount15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43
	 * QuantityAndAccount43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount68
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount30
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount30}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount43> forQuantityAndAccount43 = new MMConstraint<QuantityAndAccount43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount30;
			owner_lazy = () -> QuantityAndAccount43.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount43 obj) throws Exception {
			checkQuantityAndAccount43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount75
	 * QuantityAndAccount75}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount75> forQuantityAndAccount75 = new MMConstraint<QuantityAndAccount75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount75.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount75 obj) throws Exception {
			checkQuantityAndAccount75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1
	 * QuantityAndAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount1> forQuantityAndAccount1 = new MMConstraint<QuantityAndAccount1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount1.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount1 obj) throws Exception {
			checkQuantityAndAccount1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57
	 * QuantityAndAccount57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount51
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount51}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount57> forQuantityAndAccount57 = new MMConstraint<QuantityAndAccount57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount51;
			owner_lazy = () -> QuantityAndAccount57.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount57 obj) throws Exception {
			checkQuantityAndAccount57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56
	 * QuantityAndAccount56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount47
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount47}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount56> forQuantityAndAccount56 = new MMConstraint<QuantityAndAccount56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount47;
			owner_lazy = () -> QuantityAndAccount56.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount56 obj) throws Exception {
			checkQuantityAndAccount56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64
	 * QuantityAndAccount64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount41
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount41}</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount64> forQuantityAndAccount64 = new MMConstraint<QuantityAndAccount64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount41;
			owner_lazy = () -> QuantityAndAccount64.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount64 obj) throws Exception {
			checkQuantityAndAccount64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount76
	 * QuantityAndAccount76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount76> forQuantityAndAccount76 = new MMConstraint<QuantityAndAccount76>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount76.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount76 obj) throws Exception {
			checkQuantityAndAccount76(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20
	 * QuantityAndAccount20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount20> forQuantityAndAccount20 = new MMConstraint<QuantityAndAccount20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount20.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount20 obj) throws Exception {
			checkQuantityAndAccount20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24
	 * QuantityAndAccount24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount24> forQuantityAndAccount24 = new MMConstraint<QuantityAndAccount24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount24.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount24 obj) throws Exception {
			checkQuantityAndAccount24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2
	 * QuantityAndAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount2> forQuantityAndAccount2 = new MMConstraint<QuantityAndAccount2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount2.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount2 obj) throws Exception {
			checkQuantityAndAccount2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37
	 * QuantityAndAccount37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount37> forQuantityAndAccount37 = new MMConstraint<QuantityAndAccount37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> QuantityAndAccount37.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount37 obj) throws Exception {
			checkQuantityAndAccount37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54
	 * QuantityAndAccount54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount59
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount59}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount54> forQuantityAndAccount54 = new MMConstraint<QuantityAndAccount54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount59);
			owner_lazy = () -> QuantityAndAccount54.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount54 obj) throws Exception {
			checkQuantityAndAccount54(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29
	 * QuantityAndAccount29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount44
	 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount29> forQuantityAndAccount29 = new MMConstraint<QuantityAndAccount29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceGuideline";
			definition = "When used (see usage rule SafekeepingPlaceRule), unless special arrangements exist between the account servicer and the\r\naccount owner, it is recommended to use the place of safekeeping field following the market practice\r\ndescribed below:\r\n• SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for domestic and NCSD to NCSD settlement instructions.\r\n• SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for ICSD internal, ICSD/local and ICSD to ICSD settlement\r\ninstructions.\r\n• SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for instance, when the account servicer is a global custodian and provides the account owner with a position reporting at global custodian's agents' level. When instructing, the fund manager would therefore mention, as a place of safekeeping, the BIC of the global custodian's agent on the market.\r\nAbsence of SafekeepingPlace means that:\r\n• The SafekeepingPlace info is kept by the account servicer (SLA, account structure, ETC.) and should not be provided by the account owner.\r\n• The SafekeepingPlace is the counterparty's Depository. The transaction is therefore domestic (to an NCSD) or internal to an ICSD.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount44);
			owner_lazy = () -> QuantityAndAccount29.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount29 obj) throws Exception {
			checkQuantityAndAccount29(obj);
		}
	};

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount51(QuantityAndAccount51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount55(QuantityAndAccount55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount72(QuantityAndAccount72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount33(QuantityAndAccount33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount66(QuantityAndAccount66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the account owner, it
	 * is recommended to use the place of safekeeping field following the market
	 * practice described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount65(QuantityAndAccount65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount30(QuantityAndAccount30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount68(QuantityAndAccount68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount12(QuantityAndAccount12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount5(QuantityAndAccount5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the account owner, it
	 * is recommended to use the place of safekeeping field following the market
	 * practice described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount69(QuantityAndAccount69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount17(QuantityAndAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount32(QuantityAndAccount32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount28(QuantityAndAccount28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount47(QuantityAndAccount47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount59(QuantityAndAccount59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount41(QuantityAndAccount41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount44(QuantityAndAccount44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount39(QuantityAndAccount39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount60(QuantityAndAccount60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount25(QuantityAndAccount25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount34(QuantityAndAccount34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount15(QuantityAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount43(QuantityAndAccount43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount75(QuantityAndAccount75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount1(QuantityAndAccount1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount57(QuantityAndAccount57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount56(QuantityAndAccount56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount64(QuantityAndAccount64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount76(QuantityAndAccount76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount20(QuantityAndAccount20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount24(QuantityAndAccount24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount2(QuantityAndAccount2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount37(QuantityAndAccount37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount54(QuantityAndAccount54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * When used (see usage rule SafekeepingPlaceRule), unless special
	 * arrangements exist between the account servicer and the<br>
	 * account owner, it is recommended to use the place of safekeeping field
	 * following the market practice<br>
	 * described below:<br>
	 * • SafekeepingPlaceType/SharesHeldAtNCSD: a NCSD's BIC will be used for
	 * domestic and NCSD to NCSD settlement instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtICSD: an ICSD's BIC will be used for
	 * ICSD internal, ICSD/local and ICSD to ICSD settlement<br>
	 * instructions.<br>
	 * • SafekeepingPlaceType/SharesHeldAtLoaclCustodian: applicable, for
	 * instance, when the account servicer is a global custodian and provides
	 * the account owner with a position reporting at global custodian's agents'
	 * level. When instructing, the fund manager would therefore mention, as a
	 * place of safekeeping, the BIC of the global custodian's agent on the
	 * market.<br>
	 * Absence of SafekeepingPlace means that:<br>
	 * • The SafekeepingPlace info is kept by the account servicer (SLA, account
	 * structure, ETC.) and should not be provided by the account owner.<br>
	 * • The SafekeepingPlace is the counterparty's Depository. The transaction
	 * is therefore domestic (to an NCSD) or internal to an ICSD.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkQuantityAndAccount29(QuantityAndAccount29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}