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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.InstrumentSubStructureType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of deal for structured finance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#AssetBackedSecurity
 * InstrumentSubStructureType1Code.AssetBackedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#AirlineTrust
 * InstrumentSubStructureType1Code.AirlineTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#AutoTrust
 * InstrumentSubStructureType1Code.AutoTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#CollateralBondObligation
 * InstrumentSubStructureType1Code.CollateralBondObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#CollateralDebtObligation
 * InstrumentSubStructureType1Code.CollateralDebtObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#CreditLinkedNotes
 * InstrumentSubStructureType1Code.CreditLinkedNotes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#CollateralLoanObligation
 * InstrumentSubStructureType1Code.CollateralLoanObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#CommercialMortgage
 * InstrumentSubStructureType1Code.CommercialMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#Consumer
 * InstrumentSubStructureType1Code.Consumer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#CreditCardTrust
 * InstrumentSubStructureType1Code.CreditCardTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#HomeEquityLoans
 * InstrumentSubStructureType1Code.HomeEquityLoans}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#LoanParticipationNote
 * InstrumentSubStructureType1Code.LoanParticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#CoveredBond
 * InstrumentSubStructureType1Code.CoveredBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#PaymentRight
 * InstrumentSubStructureType1Code.PaymentRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#Repackagings
 * InstrumentSubStructureType1Code.Repackagings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#ResidentialMortgage
 * InstrumentSubStructureType1Code.ResidentialMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#StructuredCoveredBond
 * InstrumentSubStructureType1Code.StructuredCoveredBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#StraightBond
 * InstrumentSubStructureType1Code.StraightBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#StudentLoanTrust
 * InstrumentSubStructureType1Code.StudentLoanTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code#WholeBusinessSecurity
 * InstrumentSubStructureType1Code.WholeBusinessSecurity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
 * InstrumentSubStructureTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ABSE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstrumentSubStructureType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the type of deal for structured finance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstrumentSubStructureType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedSecurity"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code AssetBackedSecurity = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.AssetBackedSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirlineTrust"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code AirlineTrust = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirlineTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.AirlineTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoTrust"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code AutoTrust = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.AutoTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralBondObligation"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code CollateralBondObligation = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBondObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.CollateralBondObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralDebtObligation"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code CollateralDebtObligation = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDebtObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.CollateralDebtObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLinkedNotes"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code CreditLinkedNotes = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLinkedNotes";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.CreditLinkedNotes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralLoanObligation"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code CollateralLoanObligation = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralLoanObligation";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.CollateralLoanObligation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialMortgage"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code CommercialMortgage = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialMortgage";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.CommercialMortgage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consumer"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code Consumer = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consumer";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.Consumer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCardTrust"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code CreditCardTrust = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditCardTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.CreditCardTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeEquityLoans"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code HomeEquityLoans = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoans";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.HomeEquityLoans.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanParticipationNote"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code LoanParticipationNote = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanParticipationNote";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.LoanParticipationNote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredBond"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code CoveredBond = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredBond";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.CoveredBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRight"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code PaymentRight = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentRight";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.PaymentRight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repackagings"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code Repackagings = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repackagings";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.Repackagings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidentialMortgage"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code ResidentialMortgage = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidentialMortgage";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.ResidentialMortgage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredCoveredBond"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code StructuredCoveredBond = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredCoveredBond";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.StructuredCoveredBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StraightBond"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code StraightBond = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StraightBond";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.StraightBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StudentLoanTrust"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code StudentLoanTrust = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StudentLoanTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.StudentLoanTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureType1Code
	 * InstrumentSubStructureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WholeBusinessSecurity"</li>
	 * </ul>
	 */
	public static final InstrumentSubStructureType1Code WholeBusinessSecurity = new InstrumentSubStructureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WholeBusinessSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.InstrumentSubStructureType1Code.mmObject();
			codeName = InstrumentSubStructureTypeCode.WholeBusinessSecurity.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InstrumentSubStructureType1Code> codesByName = new LinkedHashMap<>();

	protected InstrumentSubStructureType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ABSE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstrumentSubStructureType1Code";
				definition = "Indicates the type of deal for structured finance.";
				trace_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstrumentSubStructureType1Code.AssetBackedSecurity, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.AirlineTrust,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.AutoTrust, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.CollateralBondObligation,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.CollateralDebtObligation, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.CreditLinkedNotes,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.CollateralLoanObligation, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.CommercialMortgage,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.Consumer, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.CreditCardTrust,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.HomeEquityLoans, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.LoanParticipationNote,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.CoveredBond, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.PaymentRight,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.Repackagings, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.ResidentialMortgage,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.StructuredCoveredBond, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.StraightBond,
						com.tools20022.repository.codeset.InstrumentSubStructureType1Code.StudentLoanTrust, com.tools20022.repository.codeset.InstrumentSubStructureType1Code.WholeBusinessSecurity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AssetBackedSecurity.getCodeName().get(), AssetBackedSecurity);
		codesByName.put(AirlineTrust.getCodeName().get(), AirlineTrust);
		codesByName.put(AutoTrust.getCodeName().get(), AutoTrust);
		codesByName.put(CollateralBondObligation.getCodeName().get(), CollateralBondObligation);
		codesByName.put(CollateralDebtObligation.getCodeName().get(), CollateralDebtObligation);
		codesByName.put(CreditLinkedNotes.getCodeName().get(), CreditLinkedNotes);
		codesByName.put(CollateralLoanObligation.getCodeName().get(), CollateralLoanObligation);
		codesByName.put(CommercialMortgage.getCodeName().get(), CommercialMortgage);
		codesByName.put(Consumer.getCodeName().get(), Consumer);
		codesByName.put(CreditCardTrust.getCodeName().get(), CreditCardTrust);
		codesByName.put(HomeEquityLoans.getCodeName().get(), HomeEquityLoans);
		codesByName.put(LoanParticipationNote.getCodeName().get(), LoanParticipationNote);
		codesByName.put(CoveredBond.getCodeName().get(), CoveredBond);
		codesByName.put(PaymentRight.getCodeName().get(), PaymentRight);
		codesByName.put(Repackagings.getCodeName().get(), Repackagings);
		codesByName.put(ResidentialMortgage.getCodeName().get(), ResidentialMortgage);
		codesByName.put(StructuredCoveredBond.getCodeName().get(), StructuredCoveredBond);
		codesByName.put(StraightBond.getCodeName().get(), StraightBond);
		codesByName.put(StudentLoanTrust.getCodeName().get(), StudentLoanTrust);
		codesByName.put(WholeBusinessSecurity.getCodeName().get(), WholeBusinessSecurity);
	}

	public static InstrumentSubStructureType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstrumentSubStructureType1Code[] values() {
		InstrumentSubStructureType1Code[] values = new InstrumentSubStructureType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstrumentSubStructureType1Code> {
		@Override
		public InstrumentSubStructureType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstrumentSubStructureType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}