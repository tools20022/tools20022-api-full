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
import com.tools20022.repository.codeset.PendingReason14Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction has a pending status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#AccountServicerDeadlineMissed
 * PendingReason14Code.AccountServicerDeadlineMissed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingReason14Code#Other
 * PendingReason14Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#PendingBeneficiaryOwnerDetails
 * PendingReason14Code.PendingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#MissingCertification
 * PendingReason14Code.MissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#InsufficientMoney
 * PendingReason14Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#LackOfSecurities
 * PendingReason14Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#MarketDeadlineMissed
 * PendingReason14Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#QuantityDisagreement
 * PendingReason14Code.QuantityDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#PendingReceipt
 * PendingReason14Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#WrongCertificatesNumbers
 * PendingReason14Code.WrongCertificatesNumbers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#DisagreementOnCashAmount
 * PendingReason14Code.DisagreementOnCashAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonV2Code
 * PendingFailingReasonV2Code}</li>
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
 * "PendingReason14Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction has a pending status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
 * PendingReason13Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingReason14Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#AccountServicerDeadlineMissed
	 * PendingReason13Code.AccountServicerDeadlineMissed}</li>
	 * </ul>
	 */
	public static final PendingReason14Code AccountServicerDeadlineMissed = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			previousVersion_lazy = () -> PendingReason13Code.AccountServicerDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#Other
	 * PendingReason13Code.Other}</li>
	 * </ul>
	 */
	public static final PendingReason14Code Other = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> PendingReason13Code.Other;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBeneficiaryOwnerDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#PendingBeneficiaryOwnerDetails
	 * PendingReason13Code.PendingBeneficiaryOwnerDetails}</li>
	 * </ul>
	 */
	public static final PendingReason14Code PendingBeneficiaryOwnerDetails = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBeneficiaryOwnerDetails";
			previousVersion_lazy = () -> PendingReason13Code.PendingBeneficiaryOwnerDetails;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.PendingBeneficiaryOwnerDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#MissingCertification
	 * PendingReason13Code.MissingCertification}</li>
	 * </ul>
	 */
	public static final PendingReason14Code MissingCertification = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			previousVersion_lazy = () -> PendingReason13Code.MissingCertification;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.MissingCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#InsufficientMoney
	 * PendingReason13Code.InsufficientMoney}</li>
	 * </ul>
	 */
	public static final PendingReason14Code InsufficientMoney = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			previousVersion_lazy = () -> PendingReason13Code.InsufficientMoney;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#LackOfSecurities
	 * PendingReason13Code.LackOfSecurities}</li>
	 * </ul>
	 */
	public static final PendingReason14Code LackOfSecurities = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			previousVersion_lazy = () -> PendingReason13Code.LackOfSecurities;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#MarketDeadlineMissed
	 * PendingReason13Code.MarketDeadlineMissed}</li>
	 * </ul>
	 */
	public static final PendingReason14Code MarketDeadlineMissed = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			previousVersion_lazy = () -> PendingReason13Code.MarketDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityDisagreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#QuantityDisagreement
	 * PendingReason13Code.QuantityDisagreement}</li>
	 * </ul>
	 */
	public static final PendingReason14Code QuantityDisagreement = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDisagreement";
			previousVersion_lazy = () -> PendingReason13Code.QuantityDisagreement;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.QuantityDisagreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#PendingReceipt
	 * PendingReason13Code.PendingReceipt}</li>
	 * </ul>
	 */
	public static final PendingReason14Code PendingReceipt = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			previousVersion_lazy = () -> PendingReason13Code.PendingReceipt;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.PendingReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificatesNumbers"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#WrongCertificatesNumbers
	 * PendingReason13Code.WrongCertificatesNumbers}</li>
	 * </ul>
	 */
	public static final PendingReason14Code WrongCertificatesNumbers = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			previousVersion_lazy = () -> PendingReason13Code.WrongCertificatesNumbers;
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.WrongCertificatesNumbers.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code
	 * PendingReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementOnCashAmount"</li>
	 * </ul>
	 */
	public static final PendingReason14Code DisagreementOnCashAmount = new PendingReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreementOnCashAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason14Code.mmObject();
			codeName = PendingFailingReasonV2Code.DisagreementOnCashAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingReason14Code> codesByName = new LinkedHashMap<>();

	protected PendingReason14Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingReason14Code";
				definition = "Specifies the reason why the instruction has a pending status.";
				previousVersion_lazy = () -> PendingReason13Code.mmObject();
				trace_lazy = () -> PendingFailingReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingReason14Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.PendingReason14Code.Other,
						com.tools20022.repository.codeset.PendingReason14Code.PendingBeneficiaryOwnerDetails, com.tools20022.repository.codeset.PendingReason14Code.MissingCertification,
						com.tools20022.repository.codeset.PendingReason14Code.InsufficientMoney, com.tools20022.repository.codeset.PendingReason14Code.LackOfSecurities,
						com.tools20022.repository.codeset.PendingReason14Code.MarketDeadlineMissed, com.tools20022.repository.codeset.PendingReason14Code.QuantityDisagreement,
						com.tools20022.repository.codeset.PendingReason14Code.PendingReceipt, com.tools20022.repository.codeset.PendingReason14Code.WrongCertificatesNumbers,
						com.tools20022.repository.codeset.PendingReason14Code.DisagreementOnCashAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PendingBeneficiaryOwnerDetails.getCodeName().get(), PendingBeneficiaryOwnerDetails);
		codesByName.put(MissingCertification.getCodeName().get(), MissingCertification);
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(QuantityDisagreement.getCodeName().get(), QuantityDisagreement);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(WrongCertificatesNumbers.getCodeName().get(), WrongCertificatesNumbers);
		codesByName.put(DisagreementOnCashAmount.getCodeName().get(), DisagreementOnCashAmount);
	}

	public static PendingReason14Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingReason14Code[] values() {
		PendingReason14Code[] values = new PendingReason14Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingReason14Code> {
		@Override
		public PendingReason14Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingReason14Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}