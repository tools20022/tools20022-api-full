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
import com.tools20022.repository.codeset.AccountInformationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of account information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#IntermediaryBankNameOfDealtCurrency
 * AccountInformationType1Code.IntermediaryBankNameOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#IntermediaryBankNumberOfContraCurrency
 * AccountInformationType1Code.IntermediaryBankNumberOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#IntermediaryBankNumberOfDealtCurrency
 * AccountInformationType1Code.IntermediaryBankNumberOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#BeneficiaryInstitutionBICCodeOfContraCurrency
 * AccountInformationType1Code.BeneficiaryInstitutionBICCodeOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#BeneficiaryInstitutionBICCodeOfDealtCurrency
 * AccountInformationType1Code.BeneficiaryInstitutionBICCodeOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#BeneficiaryInstitutionNameOfContraCurrency
 * AccountInformationType1Code.BeneficiaryInstitutionNameOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#BeneficiaryInstitutionNameOfDealtCurrency
 * AccountInformationType1Code.BeneficiaryInstitutionNameOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#BeneficiaryInstitutionNumberOfContraCurrency
 * AccountInformationType1Code.BeneficiaryInstitutionNumberOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#BeneficiaryInstitutionNumberOfDealtCurrency
 * AccountInformationType1Code.BeneficiaryInstitutionNumberOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#CFETSMarginSettlementAccountNumber
 * AccountInformationType1Code.CFETSMarginSettlementAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#CorrespondentBankBICCodeOfContraCurrency
 * AccountInformationType1Code.CorrespondentBankBICCodeOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#CorrespondentBankBICCodeOfDealtCurrency
 * AccountInformationType1Code.CorrespondentBankBICCodeOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#CorrespondentBankNameOfContraCurrency
 * AccountInformationType1Code.CorrespondentBankNameOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#CorrespondentBankNameOfDealtCurrency
 * AccountInformationType1Code.CorrespondentBankNameOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#CorrespondentBankNumberOfContraCurrency
 * AccountInformationType1Code.CorrespondentBankNumberOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#CorrespondentBankNumberOfDealtCurrency
 * AccountInformationType1Code.CorrespondentBankNumberOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#CurrentAccount
 * AccountInformationType1Code.CurrentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#DepositAccount
 * AccountInformationType1Code.DepositAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#FundCustodianAccountName
 * AccountInformationType1Code.FundCustodianAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#FundCustodianAccountNumber
 * AccountInformationType1Code.FundCustodianAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#FundCustodianBankName
 * AccountInformationType1Code.FundCustodianBankName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#IntermediaryBankBICCodeOfContraCurrency
 * AccountInformationType1Code.IntermediaryBankBICCodeOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#IntermediaryBankBICCodeOfDealtCurrency
 * AccountInformationType1Code.IntermediaryBankBICCodeOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#IntermediaryBankNameOfContraCurrency
 * AccountInformationType1Code.IntermediaryBankNameOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MarginCustodianAccountName
 * AccountInformationType1Code.MarginCustodianAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MarginCustodianAccountNumber
 * AccountInformationType1Code.MarginCustodianAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MarginCustodianInstitutionCode
 * AccountInformationType1Code.MarginCustodianInstitutionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MarginCustodianInstitutionName
 * AccountInformationType1Code.MarginCustodianInstitutionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MarginSettlementAccountName
 * AccountInformationType1Code.MarginSettlementAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MarginSettlementBankName
 * AccountInformationType1Code.MarginSettlementBankName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MultiCurrencyAccountDescription
 * AccountInformationType1Code.MultiCurrencyAccountDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#NoteOfDealtCurrency
 * AccountInformationType1Code.NoteOfDealtCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#SecuritiesCustodianAccountChineseName
 * AccountInformationType1Code.SecuritiesCustodianAccountChineseName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#SecuritiesCustodianAccountName
 * AccountInformationType1Code.SecuritiesCustodianAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#OtherMarginSettlementAccountNumber
 * AccountInformationType1Code.OtherMarginSettlementAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#NoteOfContraCurrency
 * AccountInformationType1Code.NoteOfContraCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MarginSettlementBankSortCode
 * AccountInformationType1Code.MarginSettlementBankSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#MarginSettlementAccountNumber
 * AccountInformationType1Code.MarginSettlementAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#SecuritiesCustodianAccountNumber
 * AccountInformationType1Code.SecuritiesCustodianAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#SecuritiesCustodianInstitutionCode
 * AccountInformationType1Code.SecuritiesCustodianInstitutionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#SecuritiesCustodianInstitutionName
 * AccountInformationType1Code.SecuritiesCustodianInstitutionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#StatusOfCashAccount
 * AccountInformationType1Code.StatusOfCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code#StatusOfSecuritiesCustodianAccount
 * AccountInformationType1Code.StatusOfSecuritiesCustodianAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountInformationTypeCode
 * AccountInformationTypeCode}</li>
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
 * "AccountInformationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of account information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountInformationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankNameOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code IntermediaryBankNameOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankNameOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.IntermediaryBankNameOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankNumberOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code IntermediaryBankNumberOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankNumberOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.IntermediaryBankNumberOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankNumberOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code IntermediaryBankNumberOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankNumberOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.IntermediaryBankNumberOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionBICCodeOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code BeneficiaryInstitutionBICCodeOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionBICCodeOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.BeneficiaryInstitutionBICCodeOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionBICCodeOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code BeneficiaryInstitutionBICCodeOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionBICCodeOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.BeneficiaryInstitutionBICCodeOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionNameOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code BeneficiaryInstitutionNameOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionNameOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.BeneficiaryInstitutionNameOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionNameOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code BeneficiaryInstitutionNameOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionNameOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.BeneficiaryInstitutionNameOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionNumberOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code BeneficiaryInstitutionNumberOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionNumberOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.BeneficiaryInstitutionNumberOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionNumberOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code BeneficiaryInstitutionNumberOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionNumberOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.BeneficiaryInstitutionNumberOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CFETSMarginSettlementAccountNumber"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code CFETSMarginSettlementAccountNumber = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CFETSMarginSettlementAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.CFETSMarginSettlementAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankBICCodeOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code CorrespondentBankBICCodeOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankBICCodeOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.CorrespondentBankBICCodeOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankBICCodeOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code CorrespondentBankBICCodeOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankBICCodeOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.CorrespondentBankBICCodeOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNameOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code CorrespondentBankNameOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankNameOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.CorrespondentBankNameOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNameOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code CorrespondentBankNameOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankNameOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.CorrespondentBankNameOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNumberOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code CorrespondentBankNumberOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankNumberOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.CorrespondentBankNumberOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankNumberOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code CorrespondentBankNumberOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankNumberOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.CorrespondentBankNumberOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentAccount"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code CurrentAccount = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.CurrentAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAccount"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code DepositAccount = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.DepositAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCustodianAccountName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code FundCustodianAccountName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCustodianAccountName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.FundCustodianAccountName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCustodianAccountNumber"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code FundCustodianAccountNumber = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCustodianAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.FundCustodianAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCustodianBankName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code FundCustodianBankName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCustodianBankName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.FundCustodianBankName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankBICCodeOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code IntermediaryBankBICCodeOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankBICCodeOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.IntermediaryBankBICCodeOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankBICCodeOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code IntermediaryBankBICCodeOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankBICCodeOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.IntermediaryBankBICCodeOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryBankNameOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code IntermediaryBankNameOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryBankNameOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.IntermediaryBankNameOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCustodianAccountName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MarginCustodianAccountName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCustodianAccountName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MarginCustodianAccountName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCustodianAccountNumber"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MarginCustodianAccountNumber = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCustodianAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MarginCustodianAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCustodianInstitutionCode"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MarginCustodianInstitutionCode = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCustodianInstitutionCode";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MarginCustodianInstitutionCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCustodianInstitutionName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MarginCustodianInstitutionName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCustodianInstitutionName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MarginCustodianInstitutionName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginSettlementAccountName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MarginSettlementAccountName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginSettlementAccountName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MarginSettlementAccountName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginSettlementBankName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MarginSettlementBankName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginSettlementBankName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MarginSettlementBankName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiCurrencyAccountDescription"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MultiCurrencyAccountDescription = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiCurrencyAccountDescription";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MultiCurrencyAccountDescription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoteOfDealtCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code NoteOfDealtCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoteOfDealtCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.NoteOfDealtCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianAccountChineseName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code SecuritiesCustodianAccountChineseName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianAccountChineseName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.SecuritiesCustodianAccountChineseName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianAccountName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code SecuritiesCustodianAccountName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianAccountName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.SecuritiesCustodianAccountName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherMarginSettlementAccountNumber"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code OtherMarginSettlementAccountNumber = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherMarginSettlementAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.OtherMarginSettlementAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoteOfContraCurrency"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code NoteOfContraCurrency = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoteOfContraCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.NoteOfContraCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginSettlementBankSortCode"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MarginSettlementBankSortCode = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginSettlementBankSortCode";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MarginSettlementBankSortCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginSettlementAccountNumber"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code MarginSettlementAccountNumber = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginSettlementAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.MarginSettlementAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianAccountNumber"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code SecuritiesCustodianAccountNumber = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.SecuritiesCustodianAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianInstitutionCode"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code SecuritiesCustodianInstitutionCode = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianInstitutionCode";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.SecuritiesCustodianInstitutionCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCustodianInstitutionName"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code SecuritiesCustodianInstitutionName = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCustodianInstitutionName";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.SecuritiesCustodianInstitutionName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOfCashAccount"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code StatusOfCashAccount = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOfCashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.StatusOfCashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountInformationType1Code
	 * AccountInformationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOfSecuritiesCustodianAccount"</li>
	 * </ul>
	 */
	public static final AccountInformationType1Code StatusOfSecuritiesCustodianAccount = new AccountInformationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOfSecuritiesCustodianAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountInformationType1Code.mmObject();
			codeName = AccountInformationTypeCode.StatusOfSecuritiesCustodianAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountInformationType1Code> codesByName = new LinkedHashMap<>();

	protected AccountInformationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountInformationType1Code";
				definition = "Specifies the type of account information.";
				trace_lazy = () -> AccountInformationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountInformationType1Code.IntermediaryBankNameOfDealtCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.IntermediaryBankNumberOfContraCurrency, com.tools20022.repository.codeset.AccountInformationType1Code.IntermediaryBankNumberOfDealtCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.BeneficiaryInstitutionBICCodeOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.BeneficiaryInstitutionBICCodeOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationType1Code.BeneficiaryInstitutionNameOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.BeneficiaryInstitutionNameOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationType1Code.BeneficiaryInstitutionNumberOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.BeneficiaryInstitutionNumberOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationType1Code.CFETSMarginSettlementAccountNumber,
						com.tools20022.repository.codeset.AccountInformationType1Code.CorrespondentBankBICCodeOfContraCurrency, com.tools20022.repository.codeset.AccountInformationType1Code.CorrespondentBankBICCodeOfDealtCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.CorrespondentBankNameOfContraCurrency, com.tools20022.repository.codeset.AccountInformationType1Code.CorrespondentBankNameOfDealtCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.CorrespondentBankNumberOfContraCurrency, com.tools20022.repository.codeset.AccountInformationType1Code.CorrespondentBankNumberOfDealtCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.CurrentAccount, com.tools20022.repository.codeset.AccountInformationType1Code.DepositAccount,
						com.tools20022.repository.codeset.AccountInformationType1Code.FundCustodianAccountName, com.tools20022.repository.codeset.AccountInformationType1Code.FundCustodianAccountNumber,
						com.tools20022.repository.codeset.AccountInformationType1Code.FundCustodianBankName, com.tools20022.repository.codeset.AccountInformationType1Code.IntermediaryBankBICCodeOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.IntermediaryBankBICCodeOfDealtCurrency, com.tools20022.repository.codeset.AccountInformationType1Code.IntermediaryBankNameOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.MarginCustodianAccountName, com.tools20022.repository.codeset.AccountInformationType1Code.MarginCustodianAccountNumber,
						com.tools20022.repository.codeset.AccountInformationType1Code.MarginCustodianInstitutionCode, com.tools20022.repository.codeset.AccountInformationType1Code.MarginCustodianInstitutionName,
						com.tools20022.repository.codeset.AccountInformationType1Code.MarginSettlementAccountName, com.tools20022.repository.codeset.AccountInformationType1Code.MarginSettlementBankName,
						com.tools20022.repository.codeset.AccountInformationType1Code.MultiCurrencyAccountDescription, com.tools20022.repository.codeset.AccountInformationType1Code.NoteOfDealtCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.SecuritiesCustodianAccountChineseName, com.tools20022.repository.codeset.AccountInformationType1Code.SecuritiesCustodianAccountName,
						com.tools20022.repository.codeset.AccountInformationType1Code.OtherMarginSettlementAccountNumber, com.tools20022.repository.codeset.AccountInformationType1Code.NoteOfContraCurrency,
						com.tools20022.repository.codeset.AccountInformationType1Code.MarginSettlementBankSortCode, com.tools20022.repository.codeset.AccountInformationType1Code.MarginSettlementAccountNumber,
						com.tools20022.repository.codeset.AccountInformationType1Code.SecuritiesCustodianAccountNumber, com.tools20022.repository.codeset.AccountInformationType1Code.SecuritiesCustodianInstitutionCode,
						com.tools20022.repository.codeset.AccountInformationType1Code.SecuritiesCustodianInstitutionName, com.tools20022.repository.codeset.AccountInformationType1Code.StatusOfCashAccount,
						com.tools20022.repository.codeset.AccountInformationType1Code.StatusOfSecuritiesCustodianAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IntermediaryBankNameOfDealtCurrency.getCodeName().get(), IntermediaryBankNameOfDealtCurrency);
		codesByName.put(IntermediaryBankNumberOfContraCurrency.getCodeName().get(), IntermediaryBankNumberOfContraCurrency);
		codesByName.put(IntermediaryBankNumberOfDealtCurrency.getCodeName().get(), IntermediaryBankNumberOfDealtCurrency);
		codesByName.put(BeneficiaryInstitutionBICCodeOfContraCurrency.getCodeName().get(), BeneficiaryInstitutionBICCodeOfContraCurrency);
		codesByName.put(BeneficiaryInstitutionBICCodeOfDealtCurrency.getCodeName().get(), BeneficiaryInstitutionBICCodeOfDealtCurrency);
		codesByName.put(BeneficiaryInstitutionNameOfContraCurrency.getCodeName().get(), BeneficiaryInstitutionNameOfContraCurrency);
		codesByName.put(BeneficiaryInstitutionNameOfDealtCurrency.getCodeName().get(), BeneficiaryInstitutionNameOfDealtCurrency);
		codesByName.put(BeneficiaryInstitutionNumberOfContraCurrency.getCodeName().get(), BeneficiaryInstitutionNumberOfContraCurrency);
		codesByName.put(BeneficiaryInstitutionNumberOfDealtCurrency.getCodeName().get(), BeneficiaryInstitutionNumberOfDealtCurrency);
		codesByName.put(CFETSMarginSettlementAccountNumber.getCodeName().get(), CFETSMarginSettlementAccountNumber);
		codesByName.put(CorrespondentBankBICCodeOfContraCurrency.getCodeName().get(), CorrespondentBankBICCodeOfContraCurrency);
		codesByName.put(CorrespondentBankBICCodeOfDealtCurrency.getCodeName().get(), CorrespondentBankBICCodeOfDealtCurrency);
		codesByName.put(CorrespondentBankNameOfContraCurrency.getCodeName().get(), CorrespondentBankNameOfContraCurrency);
		codesByName.put(CorrespondentBankNameOfDealtCurrency.getCodeName().get(), CorrespondentBankNameOfDealtCurrency);
		codesByName.put(CorrespondentBankNumberOfContraCurrency.getCodeName().get(), CorrespondentBankNumberOfContraCurrency);
		codesByName.put(CorrespondentBankNumberOfDealtCurrency.getCodeName().get(), CorrespondentBankNumberOfDealtCurrency);
		codesByName.put(CurrentAccount.getCodeName().get(), CurrentAccount);
		codesByName.put(DepositAccount.getCodeName().get(), DepositAccount);
		codesByName.put(FundCustodianAccountName.getCodeName().get(), FundCustodianAccountName);
		codesByName.put(FundCustodianAccountNumber.getCodeName().get(), FundCustodianAccountNumber);
		codesByName.put(FundCustodianBankName.getCodeName().get(), FundCustodianBankName);
		codesByName.put(IntermediaryBankBICCodeOfContraCurrency.getCodeName().get(), IntermediaryBankBICCodeOfContraCurrency);
		codesByName.put(IntermediaryBankBICCodeOfDealtCurrency.getCodeName().get(), IntermediaryBankBICCodeOfDealtCurrency);
		codesByName.put(IntermediaryBankNameOfContraCurrency.getCodeName().get(), IntermediaryBankNameOfContraCurrency);
		codesByName.put(MarginCustodianAccountName.getCodeName().get(), MarginCustodianAccountName);
		codesByName.put(MarginCustodianAccountNumber.getCodeName().get(), MarginCustodianAccountNumber);
		codesByName.put(MarginCustodianInstitutionCode.getCodeName().get(), MarginCustodianInstitutionCode);
		codesByName.put(MarginCustodianInstitutionName.getCodeName().get(), MarginCustodianInstitutionName);
		codesByName.put(MarginSettlementAccountName.getCodeName().get(), MarginSettlementAccountName);
		codesByName.put(MarginSettlementBankName.getCodeName().get(), MarginSettlementBankName);
		codesByName.put(MultiCurrencyAccountDescription.getCodeName().get(), MultiCurrencyAccountDescription);
		codesByName.put(NoteOfDealtCurrency.getCodeName().get(), NoteOfDealtCurrency);
		codesByName.put(SecuritiesCustodianAccountChineseName.getCodeName().get(), SecuritiesCustodianAccountChineseName);
		codesByName.put(SecuritiesCustodianAccountName.getCodeName().get(), SecuritiesCustodianAccountName);
		codesByName.put(OtherMarginSettlementAccountNumber.getCodeName().get(), OtherMarginSettlementAccountNumber);
		codesByName.put(NoteOfContraCurrency.getCodeName().get(), NoteOfContraCurrency);
		codesByName.put(MarginSettlementBankSortCode.getCodeName().get(), MarginSettlementBankSortCode);
		codesByName.put(MarginSettlementAccountNumber.getCodeName().get(), MarginSettlementAccountNumber);
		codesByName.put(SecuritiesCustodianAccountNumber.getCodeName().get(), SecuritiesCustodianAccountNumber);
		codesByName.put(SecuritiesCustodianInstitutionCode.getCodeName().get(), SecuritiesCustodianInstitutionCode);
		codesByName.put(SecuritiesCustodianInstitutionName.getCodeName().get(), SecuritiesCustodianInstitutionName);
		codesByName.put(StatusOfCashAccount.getCodeName().get(), StatusOfCashAccount);
		codesByName.put(StatusOfSecuritiesCustodianAccount.getCodeName().get(), StatusOfSecuritiesCustodianAccount);
	}

	public static AccountInformationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountInformationType1Code[] values() {
		AccountInformationType1Code[] values = new AccountInformationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountInformationType1Code> {
		@Override
		public AccountInformationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountInformationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}